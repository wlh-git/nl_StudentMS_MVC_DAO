package com.nl.mysql.dao.proxy;

import java.util.List;

import com.nl.mysql.dao.StudentDao;
import com.nl.mysql.dao.impl.StudentDaoImpl;
import com.nl.mysql.dbc.DataBaseConnection;
import com.nl.vo.Student;

public class GradeDaoProxy implements StudentDao {
	private DataBaseConnection dbc = null ;
	private StudentDao dao = null ;
	private int count = 0 ;
	public GradeDaoProxy() {
		this.dbc = new DataBaseConnection() ;
		this.dao = new StudentDaoImpl(this.dbc.getConnection()) ;
	}
	public boolean doAddStudent(Student student) throws Exception {
		
		return false;
	}

	public boolean doDelete(String ID) throws Exception {
		
		return false;
	}

	public Student findByID(String ID) throws Exception {
		Student student = null ;
		
		
		return student;
	}

	public List<Student> findAll() throws Exception {
		
		
		return null;
	}
	@Override
	public boolean doCheck(Student student) {
		// TODO 自动生成的方法存根
		return false;
	}

}
