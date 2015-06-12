package com.gree.gree_x.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gree.gree_x.dao.HrmResourceMapper;
import com.gree.gree_x.dao.api.KaoqinMapper;
import com.gree.gree_x.dao.ehrsoft.HrUserMapper;
import com.gree.gree_x.dao.ehrsoft.OrganizationMapper;
import com.gree.gree_x.model.HrmResource;
import com.gree.gree_x.model.HrmResourceExample;
import com.gree.gree_x.model.api.Kaoqin;
import com.gree.gree_x.model.api.KaoqinExample;
import com.gree.gree_x.model.ehrsoft.HrUser;
import com.gree.gree_x.model.ehrsoft.HrUserExample;
import com.gree.gree_x.model.ehrsoft.Organization;
import com.gree.gree_x.model.ehrsoft.OrganizationExample;
import com.gree.gree_x.vo.NewVO;

@Component
public class LoginServices {
	private static Logger log = Logger.getLogger(LoginServices.class);
	@Autowired
	private HrmResourceMapper hrmResourceMapper;
	@Autowired
	private HrUserMapper hrUserMapper;
	@Autowired
	private OrganizationMapper organizationMapper;
	@Autowired
	private KaoqinMapper kaoqinMapper;


	/**
	 * 判断OA用户是否存在
	 * @param loginid
	 * @return
	 */
	public boolean existsUserByLoginid(String loginid) {
		HrmResourceExample hrexm = new HrmResourceExample();
		hrexm.createCriteria().andLoginidEqualTo(loginid);
		Integer count = hrmResourceMapper.countByExample(hrexm);
		if(count>0){
			log.info("判断用户是否存在count:"+count);
			return true;
		}
		return false;
	}


	/**
	 * OA账户获取OA用户对象
	 * @param loginid
	 * @return
	 */
	public HrmResource getUserByLoginid(String loginid) {
		HrmResourceExample hrexm = new HrmResourceExample();
		hrexm.createCriteria().andLoginidEqualTo(loginid);
		List<HrmResource> list = hrmResourceMapper.selectByExample(hrexm);
		HrmResource user = list.get(0);
		return user;
	}


	/**
	 * 员工编号获取USER
	 * @param workcode
	 * @return
	 */
	public HrUser getUserByWorkcode(String workcode) {
		HrUserExample uiexm = new HrUserExample();
		uiexm.createCriteria().andE0127EqualTo(workcode);
		List<HrUser> list = hrUserMapper.selectByExample(uiexm);
		HrUser user = list.get(0);
		return user;
	}

	/**
	 * 员工编号查找是否存在
	 * @param workcode
	 * @return
	 */
	public boolean existsUserByWorkcode(String workcode) {
		HrUserExample uiexm = new HrUserExample();
		uiexm.createCriteria().andE0127EqualTo(workcode);
		Integer count = hrUserMapper.countByExample(uiexm);
		if(count>0){
			log.info("判断用户是否存在count:"+count);
			return true;
		}else{
			return false;
		}
	}


	/**
	 * 设置用户部门中文
	 * @param _user
	 * @return
	 */
	public HrUser setUserDept(HrUser _user) {
		String deptid = _user.getE0122();
		OrganizationExample oe = new OrganizationExample();
		oe.createCriteria().andCodeitemidEqualTo(deptid);
		List<Organization> o = organizationMapper.selectByExample(oe);
		_user.setE0122(o.get(0).getCodeitemdesc());
		return _user;
	}


	/**
	 * 根据用户查找通知信息
	 * @param _user
	 * @return
	 */
	public List<NewVO> getNewsByUser(HrUser _user) {
		List<NewVO> news = new ArrayList<NewVO>();
		
		KaoqinExample ke = new KaoqinExample();
		ke.createCriteria().andWorkcodeEqualTo(_user.getE0127()).andIsconfirmEqualTo(0);
		List<Kaoqin> kaoqins = kaoqinMapper.selectByExample(ke);
		
		if(kaoqins!=null&&kaoqins.size()>0){
			NewVO nv = new NewVO();
			nv.setName("考勤");
			nv.setUrl("hr/confirmkaoqin.do");
			news.add(nv);
		}
		return news;
	}
}
