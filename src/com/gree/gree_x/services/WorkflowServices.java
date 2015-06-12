package com.gree.gree_x.services;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gree.gree_x.dao.DocImageFileMapper;
import com.gree.gree_x.dao.HrmDepartmentMapper;
import com.gree.gree_x.dao.ImageFileMapper;
import com.gree.gree_x.dao.SequenceIndexMapper;
import com.gree.gree_x.dao.api.Workflow_115Mapper;
import com.gree.gree_x.model.DocImageFile;
import com.gree.gree_x.model.HrmDepartment;
import com.gree.gree_x.model.HrmDepartmentExample;
import com.gree.gree_x.model.ImageFile;
import com.gree.gree_x.model.SequenceIndex;
import com.gree.gree_x.model.SequenceIndexExample;
import com.gree.gree_x.model.api.Workflow_115;
import com.gree.gree_x.puc.C;

@Component
public class WorkflowServices {
	private static Logger log = Logger.getLogger(WorkflowServices.class);
	
	@Autowired
	private DocImageFileMapper docImageFileMapper;
	@Autowired
	private ImageFileMapper imageFileMapper;
	@Autowired
	private SequenceIndexMapper sequenceIndexMapper;
	@Autowired
	private Workflow_115Mapper workflow_115Mapper;
	@Autowired
	private HrmDepartmentMapper hrmDepartmentMapper;
	
	/**
	 * 提交流程，返回成功数
	 * @param fileName
	 * @param size
	 * @param workflow_115
	 * @param filetype
	 * @return
	 */
	public int creatWorkFlow(String fileName,long size,Workflow_115 workflow_115,String filetype) {
		/*获取imagefileid*/
		/*SequenceIndexExample se_exam = new SequenceIndexExample();
		se_exam.createCriteria().andIndexdescEqualTo("imagefileid");
		List<SequenceIndex> sindex = sequenceIndexMapper.selectByExample(se_exam);
		int imagefileid = sindex.get(0).getCurrentid();
		if(sindex!=null&&sindex.size()>0){
			SequenceIndex sei = new SequenceIndex();
			sei.setIndexdesc("imagefileid");
			sei.setCurrentid(imagefileid+1);
			sequenceIndexMapper.updateByExample(sei, se_exam);
		}*/
		/*获取docid*/
		/*SequenceIndexExample se_exam2 = new SequenceIndexExample();
		se_exam2.createCriteria().andIndexdescEqualTo("docid");
		List<SequenceIndex> sindex2 = sequenceIndexMapper.selectByExample(se_exam2);
		int docid = sindex2.get(0).getCurrentid();
		if(sindex2!=null&&sindex2.size()>0){
			SequenceIndex sei = new SequenceIndex();
			sei.setIndexdesc("docid");
			sei.setCurrentid(docid+1);
			sequenceIndexMapper.updateByExample(sei, se_exam2);
		}*/
		
		/*添加附件信息*/
		//构建Image信息
		/*ImageFile ifile = new ImageFile();
		ifile.setImagefileid(imagefileid);
		ifile.setImagefilename(fileName);
		ifile.setImagefiletype("application/octet-stream");
		ifile.setImagefile(null);
		ifile.setImagefileused(1);
		ifile.setIszip("0");
		ifile.setIsencrypt("0");
		ifile.setFilerealpath(C.SERVER_LOCAL_FILE_PATH+fileName);
		ifile.setDownloads(0);
		ifile.setFilesize(""+size);
		log.info("ImageFile-->size----->"+size);*/
		
		//构建DocImageFile信息
		/*DocImageFile difile = new DocImageFile();
		difile.setDocid(docid);
		difile.setImagefilename(fileName);
		difile.setImagefileid(imagefileid);
		difile.setImagefiledesc("");
		difile.setImagefileheight(0);
		difile.setImagefilewidth(0);
		difile.setVersiondetail("");
		difile.setImagefielsize(0);
		difile.setDocfiletype("2");//文件类型
		difile.setHasusedtemplet("0");
		difile.setIsextfile("1");
		int id = docImageFileMapper.selectMaxId()+1;
		log.info("DocImageFile-->id----->"+id);
		difile.setId(id);
		difile.setVersionid(id);*/
		
		//添加附件
		/*imageFileMapper.insert(ifile);
		docImageFileMapper.insert(difile);*/
		
		/*获取requestid*/
		/*RequestsequenceExample se_exam3 = new RequestsequenceExample();
		List<Requestsequence> list = requestsequenceMapper.selectByExample(se_exam3);
		int requestid = list.get(0).getRequestid();*/
		
		//转换部门
		HrmDepartmentExample hdme = new HrmDepartmentExample();
		hdme.createCriteria().andIdEqualTo(Integer.parseInt(workflow_115.getTarszdw()));
		List<HrmDepartment> list = hrmDepartmentMapper.selectByExample(hdme);
		String department = list.get(0).getDepartmentmark();
		workflow_115.setTarszdw(department);
		//构建流程数据
		int requestid = workflow_115Mapper.selectMaxId()+1;
		if(requestid!=0){
			Date d=new Date();
			SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
			//workflow_115.setFujian(docid+"");
			//System.out.println("---->"+docid);
			workflow_115.setRequestid(99);
			workflow_115.setFtriggerflag(0);
			workflow_115.setSqrq(sf.format(d));
			workflow_115Mapper.insert(workflow_115);
		}else{
			return 0;
		}
		return 1;
	}
}
