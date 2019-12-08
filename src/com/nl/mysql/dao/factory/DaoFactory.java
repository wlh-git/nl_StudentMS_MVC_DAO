package com.nl.mysql.dao.factory;

import com.nl.mysql.dao.GradeDao;
import com.nl.mysql.dao.ManagerDao;
import com.nl.mysql.dao.StudentDao;
import com.nl.mysql.dao.proxy.GradeDaoProxy;
import com.nl.mysql.dao.proxy.ManagerDaoProxy;
import com.nl.mysql.dao.proxy.StudentDaoProxy;

public class DaoFactory {
	public static StudentDao getStudentDaoInstance() {
		return new StudentDaoProxy();
	}
	public static ManagerDao getManagerDaoInstance() {
		return new ManagerDaoProxy();
	}
	public static GradeDao getGradeDaoInstance() {
		return new GradeDaoProxy() ;
	}
};
