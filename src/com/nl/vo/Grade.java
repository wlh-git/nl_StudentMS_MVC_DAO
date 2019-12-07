package com.nl.vo;

public class Grade {
	private String ID ;
	private String name ;
	private String subject ;
	private int grade ;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Grade [ID=" + ID + ", name=" + name + ", subject=" + subject + ", grade=" + grade + "]";
	}
	
}
