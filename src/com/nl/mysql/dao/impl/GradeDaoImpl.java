package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.nl.mysql.dao.GradeDao;
import com.nl.vo.Grade;

public class GradeDaoImpl implements GradeDao {
	private Connection conn = null; // 如果要想完成数据库操作则肯定需要数据库连接对象
	public GradeDaoImpl(Connection conn) {
		this.conn = conn ;
		
	}
	@Override
	public boolean doAdd(Grade grade) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean doUpdate(Grade grade) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Grade findById(String ID) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<Grade> findAll() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

}
