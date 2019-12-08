package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.nl.mysql.dao.GradeDao;
import com.nl.vo.Grade;
public class GradeDaoImpl implements GradeDao {
	private Connection conn = null; // 如果要想完成数据库操作则肯定需要数据库连接对象

	public GradeDaoImpl(Connection conn) {
		this.conn = conn;

	}

	@Override
	public boolean doAdd(Grade grade) throws Exception {
		boolean flag = false;
		PreparedStatement ps = null;
		String sql = "insert into grade(ID,name,subject,grade) values('";
		sql = sql + grade.getID() + "','" + grade.getName() + "','" + grade.getSubject() + "','" + grade.getGrade()
				+ "')";
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
	public boolean doUpdate(Grade grade) throws Exception {
		boolean flag = false;
		PreparedStatement ps = null;
		String sql = "update grade set ID='" + grade.getID() + "',name='" + grade.getName() + "',subject='"
				+ grade.getSubject() + "',grade=" + grade.getGrade()+" where ID='" + grade.getID() +"'";
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
	public Grade findById(String ID) throws Exception {
		Grade grade = new Grade();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from grade where ID='"+ID+"'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				grade.setID(rs.getString("ID"));
				grade.setName(rs.getString("name"));
				grade.setSubject(rs.getString("subject"));
				grade.setGrade(Integer.parseInt(rs.getString("grade")));
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
		return grade;
	}

	@Override
	public List<Grade> findAll() throws Exception {
		List<Grade> list = new ArrayList<Grade>() ;
		Grade grade = new Grade() ;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from grade";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				grade.setID(rs.getString("ID"));
				grade.setName(rs.getString("name"));
				grade.setSubject(rs.getString("subject"));
				grade.setGrade(Integer.parseInt(rs.getString("grade")));
				list.add(grade);
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

}
