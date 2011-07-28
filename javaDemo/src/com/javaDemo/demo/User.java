package com.javaDemo.demo;

public class User {
	
	// 姓名
	private String name;
	
	// 编号
	private String cid;
	
	/**
	 * 默认构造
	 */
	public User(){}
	
	/**
	 * 有参构造(两个参数)
	 * @param name
	 * @param age
	 */
	public User(String name){
		this.name = name;
	}
	
	
	/**
	 * 自我介绍
	 * @param user
	 * @return
	 */
	public String introduct(User user){
		
		StringBuffer strbuf = new StringBuffer();
		String message = strbuf.append("My name is ").append(user.getName()).toString();
		return message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
	
}
