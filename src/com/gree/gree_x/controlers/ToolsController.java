package com.gree.gree_x.controlers;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.gree.gree_x.model.HrmResource;
import com.gree.gree_x.model.ehrsoft.HrUser;
import com.gree.gree_x.puc.C;
import com.gree.gree_x.suport.AbstractBaseCotroller;

@Controller
@RequestMapping("/tools")
public class ToolsController extends AbstractBaseCotroller{
	//private static Logger log = Logger.getLogger(ToolsController.class);
	
	/**
	 * 上传文件
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
		HrmResource user1 = null;
		HrUser user2 = null;
		String login_method = (String)session.getAttribute(C.SESSION_METHOD);
		if(login_method.equals("OA")){
			user1 = (HrmResource) session.getAttribute(C.SESSION_KEY);
		}else{
			user2 = (HrUser)session.getAttribute(C.SESSION_KEY);
		}
		
			try {
				CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
				if(multipartResolver.isMultipart(request)){
					MultipartHttpServletRequest multirequest = (MultipartHttpServletRequest)(request);
					Iterator<String> iter = multirequest.getFileNames();
					if(iter.hasNext()){
						MultipartFile file = multirequest.getFile((String)iter.next());
						if(file!=null){
							Date d=new Date();
							SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
							SimpleDateFormat sf_time=new SimpleDateFormat("HHmmss");
							String fileName = "phone_"+sf_time.format(d)+file.getOriginalFilename();
							String path = "";
							if(login_method.equals("OA")){
								path = C.PUBLIC_UPLOAD_FILE_PATH+sf.format(d)+"\\"+user1.getWorkcode()+"\\";
							}else{
								path = C.PUBLIC_UPLOAD_FILE_PATH+sf.format(d)+"\\"+user2.getE0127()+"\\";
							}
							
							File newfile = new File(path+fileName);
							File filepath = new File(path);
							if(!filepath.exists()){
								filepath.mkdirs();
							}
							file.transferTo(newfile);
							newfile=null;
							file=null;
							filepath=null;
							super.ajaxReturn(response, "上传成功！");
						}else{
							super.ajaxReturn(response, "上传失败！");
						}
					}else{
						super.ajaxReturn(response, "上传失败！");
					}
				}else{
					super.ajaxReturn(response, "上传失败！");
				}
			} catch (IOException e) {
				e.printStackTrace();
				super.ajaxReturn(response, "上传失败！");
			}
	}
	
	/**
	 * 进入附件上传界面
	 * @param model
	 * @param request
	 * @param response
	 * @param session
	 * @return
	 */
	@RequestMapping(value="uploadpage.do", method = RequestMethod.GET)
	public String uploadPage(Model model,
			HttpServletRequest request,
			HttpServletResponse response,
			HttpSession session){
		String login_method = (String)session.getAttribute(C.SESSION_METHOD);
		if(login_method.equals("OA")){
			HrmResource user = (HrmResource) session.getAttribute(C.SESSION_KEY);
			if(user!=null){
				return "tools/upload";
			}else{
				return "error";
			}
		}else{
			HrUser user = (HrUser) session.getAttribute(C.SESSION_KEY);
			if(user!=null){
				return "tools/upload";
			}else{
				return "error";
			}
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
