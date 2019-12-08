package com.nl.mysql.dao.proxy;

import java.util.List;

import com.nl.mysql.dao.GradeDao;
import com.nl.mysql.dao.ManagerDao;
import com.nl.mysql.dao.impl.GradeDaoImpl;
import com.nl.mysql.dbc.DataBaseConnection;
import com.nl.vo.Grade;
import com.nl.vo.Manager;

public class ManagerDaoProxy implements ManagerDao {
	private DataBaseConnection dbc = null ;
	private GradeDao dao = null ;
	public ManagerDaoProxy() {
		this.dbc = new DataBaseConnection() ;
		this.dao = new GradeDaoImpl(this.dbc.getConnection()) ;
	}
	@Override
	public boolean doAdd(Manager manager) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}
	@Override
	public boolean doUpdate(Manager manager) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}
	@Override
	public boolean doDelete(String username) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}
	@Override
	public Manager findByName(String username) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}
	@Override
	public List<Manager> findAll() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}
	
}
