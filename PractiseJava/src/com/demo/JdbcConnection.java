package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  // registeration loading the driver
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC","root",""); //get the connection
			Statement stmt = con.createStatement();  //create statement
			int i = stmt.executeUpdate("insert into student(id,name,age) value(1,'ajay gaikwad',12)"); // execute the statement 
			System.out.println(i+" row updated ");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
