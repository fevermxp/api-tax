package com.gree.gree_x.controlers;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.gree.gree_x.model.api.Kaoqin;
import com.gree.gree_x.model.ehrsoft.HrUser;
import com.gree.gree_x.puc.C;
import com.gree.gree_x.services.HrSoftServices;
import com.gree.gree_x.suport.AbstractBaseCotroller;
import com.gree.gree_x.suport.ExcelTools;

@Controller
@RequestMapping("/hr")
public class HrSoftController extends AbstractBaseCotroller{
	private static Logger logger = Logger.getLogger(HrSoftController.class);
	
	@Autowired
	private HrSoftServices hrSoftServices;
	/**
	 * 上传考勤数据
	 * @param request
	 * @param response
	 * @param command
	 * @param errors
	 * @throws Exception
	 */
	@RequestMapping(value="uploadwages.do", method = RequestMethod.POST)
	public void uploadWages(HttpServletRequest request,
            HttpServletResponse response)
            throws Exception {

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Iterator<String> iter = multipartRequest.getFileNames();
        if(iter.hasNext()){
        	MultipartFile file = multipartRequest.getFile((String)iter.next());
        	ExcelTools.getTargetList(file);
        }
        super.ajaxReturn(response,"");
    }
	
	/**
	 * 跳转上传页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="uploadwagespage.do", method = RequestMethod.GET)
	public String toUploadWagesPage(HttpServletRequest request,
            HttpServletResponse response){
		
		return "hr/upload_wages";
	}
	
	/**
	 * 跳转考勤核对页面
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="confirmkaoqin.do", method = RequestMethod.GET)
	public String toConfirmKaoqinPage(HttpServletRequest request,
            HttpServletResponse response,
            Model model,
            HttpSession session){
		HrUser user = (HrUser) session.getAttribute(C.SESSION_KEY);
		
		Kaoqin k = hrSoftServices.getNewsByUser(user);
		model.addAttribute("kaoqin",k);
		return "hr/confirm_kaoqin";
	}
}
