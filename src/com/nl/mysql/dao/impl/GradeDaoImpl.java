package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.nl.mysql.dao.GradeDao;
import com.nl.vo.Grade;

public class GradeDaoImpl implements GradeDao {
	private Connection conn = null; // ���Ҫ��������ݿ������϶���Ҫ���ݿ����Ӷ���
	public GradeDaoImpl(Connection conn) {
		this.conn = conn ;
		
	}
	@Override
	public boolean doAdd(Grade grade) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean doUpdate(Grade grade) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public Grade findById(String ID) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public List<Grade> findAll() throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

}
