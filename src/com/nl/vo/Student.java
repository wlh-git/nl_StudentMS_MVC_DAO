package com.nl.vo;

import java.util.Date;

public class Student {
	private String ID ;
	private String identify ;
	private String name ;
	private String sex ;
	private Date birthday ;
	private String classes ;
	private String email ;
	private String remarks ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getIdentify() {
		return identify;
	}
	public void setIdentify(String identify) {
		this.identify = identify;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", identify=" + identify + ", name=" + name + ", sex=" + sex + ", birthday="
				+ birthday + ", classes=" + classes + ", email=" + email + ", remarks=" + remarks + "]";
	}
	
	
}
