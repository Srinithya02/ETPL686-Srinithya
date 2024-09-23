package com.evergent.corejava.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ShoppingDB {
	 public static Connection getConnection() throws Exception {
	        Class.forName("com.mysql.jdbc.Driver");
	        return DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/evergentdb", "root", "admin");
	    }
}
