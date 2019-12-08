package com.nl.mysql.dao;

import java.util.List;

import com.nl.vo.Manager;

public interface ManagerDao {
	public boolean doAdd(Manager manager) throws Exception;			//添加管理员(老师或辅导员)
	public boolean doUpdate(Manager manager) throws Exception;		//更新管理员信息
	public boolean doDelete(String username) throws Exception;		//通过管理员的用户名删除管理员信息
	public Manager findByUsername(String username) throws Exception;	//通过管理员的用户名查找某管理员信息
	public List<Manager> findAll() throws Exception;				//查找所有的管理员信息
	public boolean doCheck(String username)  throws Exception;
	public boolean doCheckPassword(String username,String password) throws Exception;
}
