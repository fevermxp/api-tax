package com.gree.gree_x.model;

import org.codehaus.jackson.annotate.JsonProperty;


public class ResultCode {
	
	@JsonProperty("ResultCode")
	private Integer resultCode;
	
	final public static ResultCode SUCCESS = new ResultCode(1);
	final public static ResultCode FAIL = new ResultCode(0);
	final public static ResultCode ERROR = new ResultCode(-1);

	public ResultCode(int ResultCode) {
		this.resultCode = ResultCode;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int ResultCode) {
		this.resultCode = ResultCode;
	}
}
