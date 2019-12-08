package com.nl.mysql.dao.proxy;

import java.util.ArrayList;
import java.util.List;

import com.nl.mysql.dao.ManagerDao;
import com.nl.mysql.dao.impl.ManagerDaoImpl;
import com.nl.mysql.dbc.DataBaseConnection;
import com.nl.vo.Manager;

public class ManagerDaoProxy implements ManagerDao {
	private DataBaseConnection dbc = null ;
	private ManagerDao dao = null ;
	public ManagerDaoProxy() {
		this.dbc = new DataBaseConnection() ;
		this.dao = new ManagerDaoImpl(this.dbc.getConnection()) ;
	}
	@Override
	public boolean doAdd(Manager manager) throws Exception {
		boolean flag = false ;
		try {
			if (this.dao.doCheck(manager.getUsername())) {
				flag = this.dao.doAdd(manager) ;
			}
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag ;
	}
	@Override
	public boolean doUpdate(Manager manager) throws Exception {
		boolean flag = false ;
		try {
			if (this.dao.doCheck(manager.getUsername())) {
				flag = this.dao.doUpdate(manager) ;
			}
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag ;
	}
	@Override
	public boolean doDelete(String username) throws Exception {
		boolean flag = false ;
		try {
			if (this.dao.doCheck(username)) {
				flag = this.dao.doDelete(username) ;
			}
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag ;
	}
	@Override
	public Manager findByUsername(String username) throws Exception {
		Manager manager = null ;
		try {
				manager = this.dao.findByUsername(username) ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return manager;
	}
	@Override
	public List<Manager> findAll() throws Exception {
		List<Manager> list = new ArrayList<Manager>();
		try {
				list = this.dao.findAll() ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return list;
	}
	@Override
	public boolean doCheck(String username) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean doCheckPassword(String username, String password) throws Exception {
		boolean flag = false;
		Manager manager = null;
		try {
			manager = this.dao.findByUsername(username) ;
			if(password.equals(manager.getPassword())) {
				flag = true;
			}
		} catch (Exception e) {
		}finally {
			this.dbc.close();
		}
		return flag;
	}
	
}
