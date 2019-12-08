package com.nl.mysql.dao.proxy;

import java.util.ArrayList;
import java.util.List;

import com.nl.mysql.dao.GradeDao;
import com.nl.mysql.dao.impl.GradeDaoImpl;
import com.nl.mysql.dbc.DataBaseConnection;
import com.nl.vo.Grade;

public class GradeDaoProxy implements GradeDao {
	private DataBaseConnection dbc = null ;
	private GradeDao dao = null ;
	//private int count = 0 ;
	public GradeDaoProxy() {
		this.dbc = new DataBaseConnection() ;
		this.dao = new GradeDaoImpl(this.dbc.getConnection()) ;
	}
	@Override
	public boolean doAdd(Grade grade) throws Exception {

		boolean flag = false ;
		try {
			if(grade!=null) {
				flag = this.dao.doAdd(grade) ;
			}
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag ;
	}
	@Override
	public boolean doUpdate(Grade grade) throws Exception {
		boolean flag = false ;
		try {
				flag = this.dao.doUpdate(grade) ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return flag ;
	}
	@Override
	public Grade findById(String ID) throws Exception {
		Grade grade = null ;
		try {
				grade = this.dao.findById(ID) ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return grade;
	}
	@Override
	public List<Grade> findAll() throws Exception {
		List<Grade> list = new ArrayList<Grade>();
		try {
				list = this.dao.findAll() ;
		} catch (Exception e) {
			throw e ;
		}finally {
			this.dbc.close();
		}
		return list;
	}
}
