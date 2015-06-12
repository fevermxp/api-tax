package com.gree.gree_x.controlers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.gree.gree_x.model.HrmResource;
import com.gree.gree_x.model.api.Workflow_115;
import com.gree.gree_x.puc.C;
import com.gree.gree_x.services.WorkflowServices;
import com.gree.gree_x.suport.AbstractBaseCotroller;

@Controller
@RequestMapping("/workflow")
public class WorkflowController extends AbstractBaseCotroller{
	private static Logger log = Logger.getLogger(WorkflowController.class);
	
	@Autowired
	private WorkflowServices workflowServices;
	
	/**
	 * 访问流程创建页面
	 * @param model
	 * @param request
	 * @param response
	 * @param workflowid
	 * @param session
	 */
	@RequestMapping(value="/workflow.do", method = RequestMethod.GET)
	public String workflow(Model model,
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("workflowid") Integer workflowid,
			HttpSession session){
		String login_method = (String)session.getAttribute(C.SESSION_METHOD);
		if(login_method.equals("OA")){
			HrmResource user = (HrmResource) session.getAttribute(C.SESSION_KEY);
			model.addAttribute("user", user);
			return "workflow/workflow_"+workflowid;
		}else{
			return "error";
		}
		
	}
	
	/**
	 * 提交流程
	 * @param model
	 * @param request
	 * @param response
	 * @param workflow_115
	 * @param session
	 */
	@RequestMapping(value="workflow_115.do", method = RequestMethod.POST)
	public void workflow_115(Model model,
			HttpServletRequest request,
			HttpServletResponse response,
			Workflow_115 workflow_115,
			HttpSession session){

		workflow_115.setTargh(workflow_115.getTargh().trim());
		workflow_115.setTarxm(workflow_115.getTarxm().trim());
		
		int result = workflowServices.creatWorkFlow(null,0,workflow_115,null);
		if(result>0){
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", "流程创建成功！5分钟后可在OA查看创建结果");
			super.ajaxReturn(response,JSONObject.fromObject(map).toString());
		}else{
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", "流程创建失败！");
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
		}
		
		//session.setAttribute("workflow_115", workflow_115);
		//HashMap<String, Object> map = new HashMap<String, Object>();
		//map.put("result", workflow_115.getTamc());
		//super.ajaxReturn(response, JSONObject.fromObject(map).toString());
	}
	
	/**
	 * 上传文件并提交流程
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 */
	@RequestMapping(value="upload.do", method = RequestMethod.POST)
	public void upload(Model model,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session){
		Workflow_115 workflow_115 = (Workflow_115)session.getAttribute("workflow_115");
		HrmResource user = (HrmResource) session.getAttribute(C.SESSION_KEY);
		if(workflow_115!=null){
			try {
				CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
				if(multipartResolver.isMultipart(request)){
					MultipartHttpServletRequest multirequest = (MultipartHttpServletRequest)(request);
					Iterator<String> iter = multirequest.getFileNames();
					if(iter.hasNext()){
						MultipartFile file = multirequest.getFile((String)iter.next());
						String filetype = getExtensionName(file.getOriginalFilename());
						if(file!=null){
							String fileName = "phone_"+UUID.randomUUID().toString().replaceAll("-", "")+"."+filetype;
							String path = C.PHONE_UPLOAD_FILE_PATH+fileName;
							File newfile = new File(path);
							long size = file.getSize();
							file.transferTo(newfile);
							workflow_115.setDlrx(user.getWorkcode());
							int result = workflowServices.creatWorkFlow(fileName,size,workflow_115,filetype);
							if(result>0){
								super.ajaxReturn(response, "上传成功！");
							}else{
								super.ajaxReturn(response, "流程创建失败！");
							}
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
				super.ajaxReturn(response, "上传失败！");
			}
		}
		session.removeAttribute("workflow_115");
	}
	
	@RequestMapping(value="uploadpage.do", method = RequestMethod.GET)
	public String uploadPage(Model model,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session){
		Workflow_115 workflow_115 = (Workflow_115)session.getAttribute("workflow_115");
		if(workflow_115!=null){
			return "workflow/upload_115";
		}else{
			model.addAttribute("error","流程信息保存失败！");
			return "error";
		}
	}
	
	
	/* 
	 * Java文件操作 获取文件扩展名 
	 * 
	 *  Created on: 2011-8-2 
	 *      Author: blueeagle 
	 */  
	    public static String getExtensionName(String filename) {   
	        if ((filename != null) && (filename.length() > 0)) {   
	            int dot = filename.lastIndexOf('.');   
	            if ((dot >-1) && (dot < (filename.length() - 1))) {   
	                return filename.substring(dot + 1);   
	            }   
	        }   
	        return filename;   
	    }
}
