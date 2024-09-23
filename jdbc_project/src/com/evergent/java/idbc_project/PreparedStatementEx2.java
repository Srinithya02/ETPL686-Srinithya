package com.evergent.java.idbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx2 {
public static void main(String[] args) {
   Connection conn = null;
    String url = "jdbc:mysql://localhost:3306/";
    String dbName = "info1";
    String driverName = "com.mysql.jdbc.Driver";
    String userName = "root";
    String password = "admin";
    try {
    Class.forName(driverName);   //Loading the Driver ,   Driver d1=new Driver()
    conn = DriverManager.getConnection(url+dbName, userName, password);
    try {
    String query = "insert into info1 values(?,?,?)";
    PreparedStatement pstmt = conn.prepareStatement(query);
    
    pstmt.setString(1,"Nithya");
    pstmt.setInt(2,10);
    pstmt.setDouble(3,55000);
    int i = pstmt.executeUpdate();
    System.out.println("Record insterted count : "+i);

    pstmt.setString(1,"Mythi");
    pstmt.setInt(2,20);
    pstmt.setDouble(3,65000);
    i = pstmt.executeUpdate();
    System.out.println("Record insterted count : "+i);
    }catch(SQLException s){
        System.out.println(s);   	
    }
    conn.close();
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}

