package com.nl.mysql.dao;

import java.util.List;

import com.nl.vo.Student;

public interface StudentDao {
	public boolean doAddStudent(Student student)  throws Exception;//增加学生信息
	public boolean doDelete(String ID)  throws Exception;//通过学号(ID)删除某学生信息
	public Student findByID(String ID)  throws Exception;//通过学号(ID)查找某学生信息
	public List<Student> findAll()  throws Exception;//列出所有学生的信息
	public boolean doCheck(Student student);//学生登入信息核对
}
