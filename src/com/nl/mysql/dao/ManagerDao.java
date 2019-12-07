package com.nl.mysql.dao;

import java.util.List;

import com.nl.vo.Manager;

public interface ManagerDao {
	public boolean doAdd(Manager manager) throws Exception;			//���ӹ���Ա(��ʦ�򸨵�Ա)
	public boolean doUpdate(Manager manager) throws Exception;		//���¹���Ա��Ϣ
	public boolean doDelete(String username) throws Exception;		//ͨ������Ա���û���ɾ������Ա��Ϣ
	public Manager findByName(String username) throws Exception;	//ͨ������Ա���û�������ĳ����Ա��Ϣ
	public List<Manager> findAll() throws Exception;				//�������еĹ���Ա��Ϣ
}