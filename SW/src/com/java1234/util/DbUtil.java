package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
   private String dbUtil="jdbc:mysql://localhost:3306/db_book";//�����ַ���
   private String dbUsername="root";
   private String dbPassword="123456";
   private String jdbcName="com.mysql.jdbc.Driver";//��������
   /**
    * ��ȡ���ݿ�����
    * */
   public Connection getConn(){
      Connection conn = null;
	   try {
		Class.forName(jdbcName);
		conn=DriverManager.getConnection(dbUtil,dbUsername,dbPassword);//(control+shift+o�Զ������)
	  } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }  
	  return conn;
   }
   //�ر�
   public  void closeConn(Connection conn){
	   try {
		   if(conn!=null){
			   conn.close();
		   }
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
   }
   public static void main(String[] args) {//дmainȻ���Զ���ʾ�ͳ�һ��
	   DbUtil  dbUtil=new DbUtil();
	   try{
		   dbUtil.getConn();
		   
	   }catch (Exception e) {
		// TODO: handle exception
		   e.printStackTrace();
	   }
   }
}
