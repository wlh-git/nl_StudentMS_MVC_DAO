package com.nl.mysql.dao.proxy;

import java.util.List;

import com.nl.mysql.dao.GradeDao;
import com.nl.mysql.dao.StudentDao;
import com.nl.mysql.dao.impl.StudentDaoImpl;
import com.nl.mysql.dbc.DataBaseConnection;
import com.nl.vo.Grade;

public class GradeDaoProxy implements GradeDao {
	private DataBaseConnection dbc = null ;
	private StudentDao dao = null ;
	private int count = 0 ;
	public GradeDaoProxy() {
		this.dbc = new DataBaseConnection() ;
		this.dao = new StudentDaoImpl(this.dbc.getConnection()) ;
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
