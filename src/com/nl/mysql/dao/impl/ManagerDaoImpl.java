package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.nl.mysql.dao.ManagerDao;
import com.nl.vo.Manager;

public class ManagerDaoImpl implements ManagerDao {
	private Connection conn = null; // 如果要想完成数据库操作则肯定需要数据库连接对象
	public ManagerDaoImpl(Connection conn) {
		this.conn = conn ;
	}
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
	public boolean doDelete(String name) throws Exception {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Manager findByName(String name) throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<Manager> findAll() throws Exception {
		// TODO 自动生成的方法存根
		return null;
	}

}
