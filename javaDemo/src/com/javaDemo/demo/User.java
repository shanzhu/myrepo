package com.javaDemo.demo;

public class User {
	
	// 姓名
	private String name;
	
	// 编号
	private String cid;
	
	// 年龄
	private String age;
	
	/**
	 * 默认构造
	 */
	public User(){}
	
	/**
	 * 有参构造
	 * @param name
	 * @param age
	 */
	public User(String name,String age){
		this.name = name;
		this.age = age;
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
	
}
