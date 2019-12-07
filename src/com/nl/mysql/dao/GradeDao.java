package com.nl.mysql.dao;

import java.util.List;

import com.nl.vo.Grade;

public interface GradeDao {
	public boolean doAdd(Grade grade) throws Exception;			//增加学生成绩
	public boolean doUpdate(Grade grade) throws Exception;		//更新学生成绩
	public Grade findById(String ID) throws Exception;			//通过学生学号(ID)查询成绩
	public List<Grade> findAll() throws Exception;				//列出所有学生的成绩信息
}
