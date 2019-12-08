package com.nl.mysql.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.nl.mysql.dao.StudentDao;
import com.nl.vo.Student;

public class StudentDaoImpl implements StudentDao {
	private Connection conn = null; // 如果要想完成数据库操作则肯定需要数据库连接对象

	public StudentDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public boolean doAddStudent(Student student) throws Exception {
		boolean flag = false ;
		PreparedStatement ps = null;
		String sql = "insert into student(ID,identify,name,sex,birthday,classes,email,remarks) values('";
		sql = sql + student.getID() + "','" + student.getIdentify() + "','" + student.getIdentify() + "','"
				+ student.getName() + "','" + student.getSex() + "','" + student.getBirthday() + "','"
				+ student.getClasses() + "','" + student.getEmail() + "','" + student.getRemarks() + "')";
		try {
			ps = conn.prepareStatement(sql);
			int i = ps.executeUpdate();
			if (i>0) {
				flag =true ;
			}
		} catch (Exception e) {
		}finally {
			if (ps!=null) {
				try {
					ps.close();
				} catch (Exception e2) {
				}
			}
		}
		return flag ;
	}

	@Override
	public boolean doDelete(String ID) throws Exception {
		boolean flag = false;
		PreparedStatement ps = null ;
		String sql = "delete from student where ID='"+ID+"'";
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
	public Student findByID(String ID) throws Exception {
		Student student = new Student();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student where ID='"+ID+"'";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
				student.setID(rs.getString("ID"));
				student.setIdentify(rs.getString("identify"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirthday(rs.getDate("birthday"));
				student.setClasses(rs.getString("classes"));
				student.setEmail(rs.getString("email"));
				student.setRemarks(rs.getString("remarks"));
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
		return student;
	}

	@Override
	public List<Student> findAll() throws Exception {
		List<Student> list = new ArrayList<Student>() ;
		Student student = new Student() ;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				student.setID(rs.getString("ID"));
				student.setIdentify(rs.getString("identify"));
				student.setName(rs.getString("name"));
				student.setSex(rs.getString("sex"));
				student.setBirthday(rs.getDate("birthday"));
				student.setClasses(rs.getString("classes"));
				student.setEmail(rs.getString("email"));
				student.setRemarks(rs.getString("remarks"));
				list.add(student);
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

	@Override
	public boolean doCheck(String ID) throws Exception {
		boolean flag = true;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from student where ID='"+ID+"'";
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
	public boolean doCheckname(String iD, String identify, String name) throws Exception {
		return false;
	}

}
