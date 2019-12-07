package com.nl.mysql.dao;

import java.util.List;

import com.nl.vo.Grade;

public interface GradeDao {
	public boolean doAdd(Grade grade) throws Exception;			//����ѧ���ɼ�
	public boolean doUpdate(Grade grade) throws Exception;		//����ѧ���ɼ�
	public Grade findById(String ID) throws Exception;			//ͨ��ѧ��ѧ��(ID)��ѯ�ɼ�
	public List<Grade> findAll() throws Exception;				//�г�����ѧ���ĳɼ���Ϣ
}
