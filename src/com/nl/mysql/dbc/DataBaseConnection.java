package com.nl.mysql.dbc;

import java.sql.* ;
public class DataBaseConnection{
	public static final String DBDRIVER = "com.mysql.jdbc.Driver" ;
	public static final String DBURL = "jdbc:mysql://localhost:3306/db_nl_student" ;
	public static final String DBUSER = "root" ;
	public static final String DBPASS = "123456" ;
	private Connection conn = null ;
	public DataBaseConnection(){
		try{
			Class.forName(DBDRIVER) ;
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASS) ;
		}catch(Exception e){
			e.printStackTrace() ;
		}
	}
	public Connection getConnection(){
		return this.conn ;
	}
	public void close(){
		if(this.conn!=null){
			try{
				this.conn.close() ;
			}catch(Exception e){}
		}
	}
};
