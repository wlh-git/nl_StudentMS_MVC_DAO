package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.nl.mysql.dao.StudentDao;
import com.nl.vo.Student;

public class StudentDaoImpl implements StudentDao {
	private Connection conn = null; // ���Ҫ��������ݿ������϶���Ҫ���ݿ����Ӷ���
	public StudentDaoImpl(Connection conn) {
		this.conn = conn ;
	}
	@Override
	public boolean doAddStudent(Student student) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean doDelete(String ID) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public Student findByID(String ID) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}
	@Override
	public boolean doCheck(Student student) {
		
		return false;
	}

}
