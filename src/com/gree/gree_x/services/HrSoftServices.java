package com.gree.gree_x.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gree.gree_x.dao.api.KaoqinMapper;
import com.gree.gree_x.model.api.Kaoqin;
import com.gree.gree_x.model.api.KaoqinExample;
import com.gree.gree_x.model.ehrsoft.HrUser;

@Component
public class HrSoftServices {

	private static Logger log = Logger.getLogger(HrSoftServices.class);
	@Autowired
	private KaoqinMapper kaoqinMapper;
	
	public Kaoqin getNewsByUser(HrUser user) {
		Kaoqin r = new Kaoqin();
		KaoqinExample ke = new KaoqinExample();
		ke.createCriteria().andWorkcodeEqualTo(user.getE0127()).andIsconfirmEqualTo(0);
		List<Kaoqin> kaoqins = kaoqinMapper.selectByExample(ke);
		for(Kaoqin k : kaoqins){
			r = k;
		}
		return r;
	}
}
