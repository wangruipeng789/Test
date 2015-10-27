package com.java1234.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
   private String dbUtil="jdbc:mysql://localhost:3306/db_book";//连接字符串
   private String dbUsername="root";
   private String dbPassword="123456";
   private String jdbcName="com.mysql.jdbc.Driver";//驱动名称
   /**
    * 获取数据库连接
    * */
   public Connection getConn(){
      Connection conn = null;
	   try {
		Class.forName(jdbcName);
		conn=DriverManager.getConnection(dbUtil,dbUsername,dbPassword);//(control+shift+o自动引入包)
	  } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }  
	  return conn;
   }
   //关闭
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
   public static void main(String[] args) {//写main然后自动提示就出一行
	   DbUtil  dbUtil=new DbUtil();
	   try{
		   dbUtil.getConn();
		   
	   }catch (Exception e) {
		// TODO: handle exception
		   e.printStackTrace();
	   }
   }
}
