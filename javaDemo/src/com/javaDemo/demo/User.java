package com.javaDemo.demo;

public class User {
	
	// 姓名
	private String name;
	
	// 编号
	private String cid;
	
	// 年龄
	private String age;
	
	// 电话
	private String phone;
	
	// 地址
	private String address;
	
	/**
	 * 默认构造
	 */
	public User(){}
	
	/**
	 * 有参构造(两个参数)
	 * @param name
	 * @param age
	 */
	public User(String name,String age){
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 有参构造 (三个参数)
	 * @param name
	 * @param cid
	 * @param age
	 */
	public User(String name,String cid,String age){
		this.name = name;
		this.cid = cid;
		this.age = age;
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
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
