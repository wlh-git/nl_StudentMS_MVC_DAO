package com.nl.mysql.dao.proxy;

import java.util.ArrayList;
import java.util.List;

import com.nl.mysql.dao.StudentDao;
import com.nl.mysql.dao.impl.StudentDaoImpl;
import com.nl.mysql.dbc.DataBaseConnection;
import com.nl.vo.Student;

public class StudentDaoProxy implements StudentDao {
	private DataBaseConnection dbc = null ;
	private StudentDao dao = null ;
	//private int count = 0 ;
	public StudentDaoProxy() {
		this.dbc = new DataBaseConnection() ;
		this.dao = new StudentDaoImpl(this.dbc.getConnection()) ;
	}
	public boolean doAddStudent(Student student) throws Exception {
		boolean flag = false ;
		try {
			if (this.dao.doCheck(student.getID())) {
				flag = this.dao.doAddStudent(student) ;
			}
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag ;
	}

	public boolean doDelete(String ID) throws Exception {
		boolean flag = false ;
		try {
			if (this.dao.doCheck(ID)){
				flag = this.dao.doDelete(ID) ;
			}
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag;
	}

	public Student findByID(String ID) throws Exception {
		Student student = null ;
		try {
				student = this.dao.findByID(ID) ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return student;
	}

	public List<Student> findAll() throws Exception {
		List<Student> list = new ArrayList<Student>();
		try {
				list = this.dao.findAll() ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return list;
	}
	public boolean doCheck(String ID) throws Exception {
		
		return false;
	}
	public boolean doCheckname(String ID,String identify,String name) throws Exception {
		boolean flag = false;
		Student student = null;
		try {
			student = this.dao.findByID(ID) ;
			if(identify.equals(student.getIdentify())&&name.equals(student.getName())) {
				flag = true;
			}
		} catch (Exception e) {
		}finally {
			this.dbc.close();
		}
		return flag;
	}

}
