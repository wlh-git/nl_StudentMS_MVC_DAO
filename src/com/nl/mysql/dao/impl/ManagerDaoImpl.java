package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.nl.mysql.dao.ManagerDao;
import com.nl.vo.Manager;

public class ManagerDaoImpl implements ManagerDao {
	private Connection conn = null; // 如果要想完成数据库操作则肯定需要数据库连接对象

	public ManagerDaoImpl(Connection conn) {
		this.conn = conn;
	}

	public boolean doAdd(Manager manager) throws Exception {
		boolean flag = false;
		PreparedStatement ps = null;
		String sql = "insert into manager(username,name,phone,address,password) values('";
		sql = sql + manager.getUsername() + "','" + manager.getName() + "','" + manager.getPhone() + "','"
				+ manager.getAddress() + "','" + manager.getPassword() + "')";
		try {
			ps = conn.prepareStatement(sql);
			int i = ps.executeUpdate();
			if (i > 0) {
				flag = true;
			}
		} catch (Exception e) {
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
		}
		return flag;
	}

	@Override
	public boolean doUpdate(Manager manager) throws Exception {
		boolean flag = false;
		PreparedStatement ps = null;
		String sql = "update manager set username='" + manager.getUsername() + "',name='" + manager.getName()
				+ "',phone='" + manager.getPhone() + "',address=" + manager.getAddress() + "',password="
				+ manager.getPassword() + " where name='" + manager.getName() + "'";
		try {
			ps = conn.prepareStatement(sql);
			int i = ps.executeUpdate();
			if (i > 0) {
				flag = true;
			}
		} catch (Exception e) {
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
		}
		return flag;
	}

	@Override
	public boolean doDelete(String username) throws Exception {
		boolean flag = false;
		PreparedStatement ps = null ;
		String sql = "delete from manager where username='"+username+"'";
		try {
			ps = conn.prepareStatement(sql);
			int i = ps.executeUpdate();
			if(i>0) {
				flag = true;
			}
		} catch (Exception e) {
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
		}
		
		return flag;
	}

	@Override
	public Manager findByUsername(String username) throws Exception {
		Manager manager = new Manager();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from manager where name='"+username+"'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				manager.setUsername(rs.getString("username"));
				manager.setName(rs.getString("name"));
				manager.setPhone(rs.getString("phone"));
				manager.setAddress(rs.getString("address"));
				manager.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (Exception e2) {
				}
			}
		}
		return manager;
	}

	@Override
	public List<Manager> findAll() throws Exception {
		List<Manager> list = new ArrayList<Manager>() ;
		Manager manager = new Manager();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from manager";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				manager.setUsername(rs.getString("username"));
				manager.setName(rs.getString("name"));
				manager.setPhone(rs.getString("phone"));
				manager.setAddress(rs.getString("address"));
				manager.setPassword(rs.getString("password"));
				list.add(manager);
			}
		} catch (Exception e) {
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (Exception e2) {
				}
			}
		}
		return list;
	}
	public boolean doCheck(String username) throws Exception {
		boolean flag = true;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from manager where username='"+username+"'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				flag = false;
			}
		} catch (Exception e) {
		}
		return flag;
	}

	@Override
	public boolean doCheckPassword(String username, String password) throws Exception {
		return false;
	}
}
