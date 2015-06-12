package com.gree.gree_x.controlers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.gree.gree_x.model.HrmResource;
import com.gree.gree_x.model.ehrsoft.HrUser;
import com.gree.gree_x.puc.C;
import com.gree.gree_x.services.LoginServices;
import com.gree.gree_x.suport.AbstractBaseCotroller;
import com.gree.gree_x.vo.NewVO;


@Controller
@RequestMapping("/user")
public class LoginController extends AbstractBaseCotroller{
	private static Logger log = Logger.getLogger(LoginController.class);
	private final static String USID_COOKIE = "loginid";
	@Autowired
	private LoginServices loginServices;
	
	/**
	 * 登录页面
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/signin.do", method = RequestMethod.GET)
	public String signin_page(Model model,
			HttpServletRequest request){
		model.addAttribute("loginid", StringUtils.trim(super.getCookie(request, USID_COOKIE)));
		return "signin";
	}
	
	/**
	 * OA用户登录
	 * @param model
	 * @param session
	 * @param request
	 * @param response
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/signin_oa.do", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public void signin(Model model,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestBody String str) {
		str = str.toLowerCase();
		HrmResource hrmResource = (HrmResource)JSONObject.toBean(JSONObject.fromObject(str), HrmResource.class);
		if (StringUtils.isBlank(hrmResource.getLoginid()) || StringUtils.isBlank(hrmResource.getPassword())) {
			model.addAttribute("msg", "用户名或密码不能为空");
			//return "signin";
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", 0);
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
			return;
		}
		
        //判断用户是否在系统用户中
		if (!loginServices.existsUserByLoginid(hrmResource.getLoginid())) {
			model.addAttribute("msg", "用户不存在");
			//return "signin";
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", 2);
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
			return;
		}
		
		HrmResource _user = loginServices.getUserByLoginid(hrmResource.getLoginid());
		
		//域用户判断
		//boolean password_correct = LdapUtil.authenticate(usid, pass) != null;
		boolean password_correct = false;
		if(!password_correct){
			//数据库判断
			//password_correct = StringUtils.equals(_user.getPass(), MD5.createMD5(pass, 32));
			password_correct = StringUtils.equals(DigestUtils.md5Hex(hrmResource.getPassword()).toUpperCase(),_user.getPassword());
		}
		if (!password_correct) {
			model.addAttribute("msg", "密码不正确");
			//return "signin";
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", 3);
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
			return;
		}
		
		session.setAttribute(C.SESSION_KEY, _user);
		session.setAttribute(C.SESSION_METHOD, "OA");
//		
		/*List<Node> nodeList = null;
		if (_user.getMark() == C.SYSTEM_ADMIN) {
			nodeList = rbacService.getNodeListForAdminByPid("0");
		} else {
			nodeList = rbacService.getNodeListByUsidAndPid(_user.getUsid(), "0");
		}*/
		
		super.setCookie(response, USID_COOKIE, _user.getLoginid(), 7*24*3600);
		//session.setAttribute("nodeList", nodeList);
		//systemService.insertLog("登录", "", "IP:"+request.getRemoteAddr());
		//return "redirect:/interface.do";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", 1);
		super.ajaxReturn(response, JSONObject.fromObject(map).toString());
		return;
	}
	
	/**
	 * 员工编号用户登录
	 * @param model
	 * @param session
	 * @param request
	 * @param response
	 * @param str
	 * @return
	 */
	@RequestMapping(value = "/signin_workcode.do", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public void signin_workcode(Model model,
			HttpSession session,
			HttpServletRequest request,
			HttpServletResponse response,
			@RequestBody String str) {
		//log.debug("str:"+str);
		//str = str.toLowerCase();
		JSONObject json = JSONObject.fromObject(str);
		Iterator iter = json.keySet().iterator();
		Map<String,String> loginmap = new HashMap<String,String>();  
	    while (iter.hasNext()) {  
	        String key = (String) iter.next();  
	        String value = json.getString(key);  
	        loginmap.put(key, value);  
	    }
		//HrUser user = (HrUser)JSONObject.toBean(JSONObject.fromObject(str), HrUser.class);
	    log.debug("workcode:"+loginmap.get("workcode"));
		if (StringUtils.isBlank(loginmap.get("workcode")) || StringUtils.isBlank(loginmap.get("password"))) {
			model.addAttribute("msg", "用户名或密码不能为空");
			//return "signin";
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", 0);
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
			return;
		}
		
        //判断用户是否在系统用户中
		if (!loginServices.existsUserByWorkcode(loginmap.get("workcode"))) {
			model.addAttribute("msg", "用户不存在");
			//return "signin";
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", 2);
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
			return;
		}
		
		HrUser _user = loginServices.getUserByWorkcode(loginmap.get("workcode"));
		
		boolean password_correct = false;
		if(!password_correct){
			password_correct = StringUtils.equals(loginmap.get("password"),_user.getC01vc());
			log.debug("------------------->password_correct:"+password_correct);
		}
		if (!password_correct) {
			model.addAttribute("msg", "密码不正确");
			//return "signin";
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("result", 3);
			super.ajaxReturn(response, JSONObject.fromObject(map).toString());
			return;
		}
		_user = loginServices.setUserDept(_user);
		List<NewVO> news = loginServices.getNewsByUser(_user);
		session.setAttribute("news", news);
		session.setAttribute(C.SESSION_KEY, _user);
		session.setAttribute(C.SESSION_METHOD, "WC");
		
		super.setCookie(response, USID_COOKIE, _user.getE0127(), 7*24*3600);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", 1);
		super.ajaxReturn(response, JSONObject.fromObject(map).toString());
		return;
	}
	
	/**
	 * 用户注销
	 * @param model
	 * @param session
	 */
	@RequestMapping(value="/signout.do")
	public void signout_page(Model model,
			HttpServletResponse response,
			HttpSession session) {
		session.invalidate();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", 1);
		super.ajaxReturn(response, JSONObject.fromObject(map).toString());
	}
}
