package com.zxl;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private Integer code;  //错误码

	public BusinessException() {
	}

	//自定义构造器，只保留一个，让其必须输入错误码及内容
	public BusinessException(int code,String msg) {
		super(msg);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

}