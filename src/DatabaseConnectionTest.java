import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

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
			
			System.out.println("Db Connection Successfull !");
			
			
		} catch (SQLException e) {
			System.out.println("DB Connection Failure !");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}
