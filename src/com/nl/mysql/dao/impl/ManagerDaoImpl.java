package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.util.List;

import com.nl.mysql.dao.ManagerDao;
import com.nl.vo.Manager;

public class ManagerDaoImpl implements ManagerDao {
	private Connection conn = null; // ���Ҫ��������ݿ������϶���Ҫ���ݿ����Ӷ���
	public ManagerDaoImpl(Connection conn) {
		this.conn = conn ;
	}
	public boolean doAdd(Manager manager) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean doUpdate(Manager manager) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean doDelete(String name) throws Exception {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public Manager findByName(String name) throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public List<Manager> findAll() throws Exception {
		// TODO �Զ����ɵķ������
		return null;
	}

}
