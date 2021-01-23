package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		
		try {
			// 1. Get Connection
			conn = DBConnection.initConnection();
			// 2. Create Statement
			stm = conn.createStatement();
			// 3. execute query 
			String query = "insert into employees "+
			"( id ,first_name,last_name,email,department,salary) "+
			"values "+
			"(4, 'Vijaya', 'Kumar', 'kumar@gmail.com', 'Operations', 2903847.23),"+
			"(5, 'Marry', 'Smith', 'marray@gmail.com', 'Operations', 2903847.23)";
			
			int rowsAffected = stm.executeUpdate(query);
			System.out.println("No of Rows affected "+ rowsAffected);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//clean up
			if(stm !=null) {
				stm.close();
			}if(conn !=null) {
				conn.close();
			}
		}
		

	}

}
