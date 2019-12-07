package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.nl.mysql.dao.StudentDao;
import com.nl.vo.Student;

public class StudentDaoImpl implements StudentDao {
	private Connection conn = null; // 如果要想完成数据库操作则肯定需要数据库连接对象
	public StudentDaoImpl(Connection conn) {
		this.conn = conn ;
	}
	@Override
	public boolean doAddStudent(Student student) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean doDelete(String ID) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Student findByID(String ID) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public boolean doCheck(Student student) {
		
		return false;
	}

}
