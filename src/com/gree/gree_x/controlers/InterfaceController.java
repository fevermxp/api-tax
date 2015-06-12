package com.gree.gree_x.controlers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gree.gree_x.model.HrmResource;
import com.gree.gree_x.model.ehrsoft.HrUser;
import com.gree.gree_x.puc.C;
import com.gree.gree_x.vo.NewVO;


@Controller
public class InterfaceController {
	private static Logger log = Logger.getLogger(InterfaceController.class);
	@RequestMapping(value = "/interface.do")
	public String index(Model model, HttpSession session) {
		String login_method = (String)session.getAttribute(C.SESSION_METHOD);
		if(login_method.equals("OA")){
			HrmResource user = (HrmResource) session.getAttribute(C.SESSION_KEY);
			model.addAttribute("login_method",login_method);
			model.addAttribute("user", user);
			log.debug("进入OA主页");
		}else{
			HrUser user = (HrUser) session.getAttribute(C.SESSION_KEY);
			List<NewVO> news = (List<NewVO>) session.getAttribute("news");
			model.addAttribute("login_method",login_method);
			model.addAttribute("user", user);
			model.addAttribute("news", news);
			log.debug("进入员工编号主页");
		}
		
		return "interface";
	}
}
