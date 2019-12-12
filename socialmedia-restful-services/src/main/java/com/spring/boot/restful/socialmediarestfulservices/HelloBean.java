package com.spring.boot.restful.socialmediarestfulservices;

public class HelloBean {

	private String msg;

	public HelloBean(String string) {
		
		this.msg = string;
	}
	
	

	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	@Override
	public String toString() {
		return "HelloBean [msg=" + msg + "]";
	}
	
	

}
