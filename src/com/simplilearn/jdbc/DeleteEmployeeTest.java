package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployeeTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		
		try {
			// 1. Get Connection
			conn = DBConnection.initConnection();
			// 2. Create Statement
			stm = conn.createStatement();
			
			String query = "delete from employees where id=2";
			
			int rowAfftected = stm.executeUpdate(query);
			System.out.println("No of records deleted "+rowAfftected);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}  finally {
			//clean up
			if(stm !=null) {
				stm.close();
			}if(conn !=null) {
				conn.close();
			}
		}

	}

}
