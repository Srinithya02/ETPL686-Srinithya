package com.evergent.java.idbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//mysql>create table employee9(no integer,ename varchar(20),sal float(8,2));
//mysql> insert into employee9 values(101,'raj1',10000);

public class ResultSetNextExamplemMsql {
public static void main(String[] args) {
   Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "evergentdb";
    String driverName = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "admin";
    try{
      Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
      conn = DriverManager.getConnection(url+dbName, userName, password);
      try{
        Statement stmt = conn.createStatement();                
        ResultSet rs=stmt.executeQuery("Select * from employee9");
            while(rs.next()){
      	 System.out.println("Employee No :" + rs.getInt(1));
           System.out.println("Employee Name :" + rs.getString("ename"));
      	    	System.out.println("Employee sal :"+rs.getInt(3));
        }         }
      catch(SQLException s){
        System.out.println(s);
      }
      conn.close();
    }
    catch (Exception e){
      e.printStackTrace();
    }  }}

/*
Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
conn = DriverManager.getConnection(url+dbName, userName, password);
String query = "insert into info1 values(?,?,?)";
PreparedStatement pstmt = conn.prepareStatement(query);
pstmt.setString(1,"Nithya");
pstmt.setInt(1,10);
pstmt.setDouble(1,55000);
int i = pstmt.executeUpdate();
System.out.println("Record insterted count : "+i);

pstmt.setString(1,"Mythi");
pstmt.setInt(1,20);
pstmt.setDouble(1,65000);
i = pstmt.executeUpdate();
System.out.println("Record insterted count : "+i); */