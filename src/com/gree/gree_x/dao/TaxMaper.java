package com.gree.gree_x.dao;

public class TaxMaper {
	/**
	 * 查询供应商代码
	 * @param fcode
	 * @return
	 */
	public boolean selectFactionByCode(String fcode){
		if(fcode.equals("F10002") || fcode.equals("F10001")){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 查询公司代码
	 * @param compcode
	 * @return
	 */
	public boolean selectCompByCode(String compcode){
		if(compcode.equals("400")){
			return true;
		}else{
			return false;
		}
	}
	/**
	 * 查询密钥
	 * @param fcode
	 * @return
	 */
	public String getPrivateKey(String fcode){
		if(fcode.equals("F10002")){
			return "adfda";
		}else if(fcode.equals("F10001")){
			return "fdads";
		}else{
			return "";
		}
	}
	
	public boolean checkSubPwdByCode(String supCode,String supPwd){
		if(supCode.toUpperCase().equals("F10002")||supPwd.equals("123456")){
		return true;
		}else{return false;}
	}
	
	
	
}
