package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTest {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/emsystem";
		String username = "root";
		String password = "root";
		String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		
		try {
			// 1. Register Driver
			Class.forName(JDBC_DRIVER);
			
			// 2. Create / Get connection 
			Connection conn = DriverManager.getConnection(url,username,password);
			
			// 3. Create a Statement
			Statement stm = conn.createStatement();
			
			// 4. Execute Query -> ( 1. create query , 2. execute query)
			String query = "select * from employees";
			ResultSet rest = stm.executeQuery(query);
			
			while(rest.next()) {
				System.out.println(
						rest.getInt("id")  +"  "+ 
						rest.getString("first_name")  +"  "+
						rest.getString("last_name")  +"  "+
						rest.getString("email")  +"  "+
						rest.getString("department")  +"  "+
						rest.getDouble("salary")  +"  ");
			}
			
			
		} catch (SQLException e) {
			System.out.println("DB Connection Failure !");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

}
