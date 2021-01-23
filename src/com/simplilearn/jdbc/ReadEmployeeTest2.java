package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTest2 {

	public static void main(String[] args) {
	
		
		try {
			// 2. Create / Get connection 
			Connection conn = DBConnection.initConnection();			
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
			
		}
	}

}
