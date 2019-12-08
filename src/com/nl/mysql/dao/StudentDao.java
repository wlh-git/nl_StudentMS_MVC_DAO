package com.nl.mysql.dao;

import java.util.List;

import com.nl.vo.Student;

public interface StudentDao {
	public boolean doAddStudent(Student student)  throws Exception;//����ѧ����Ϣ
	public boolean doDelete(String ID)  throws Exception;//ͨ��ѧ��(ID)ɾ��ĳѧ����Ϣ
	public Student findByID(String ID)  throws Exception;//ͨ��ѧ��(ID)����ĳѧ����Ϣ
	public List<Student> findAll()  throws Exception;//�г�����ѧ������Ϣ
	public boolean doCheck(String ID)  throws Exception;//ѧ��������Ϣ�˶�
	public boolean doCheckname(String iD, String identify, String name) throws Exception ;
}
