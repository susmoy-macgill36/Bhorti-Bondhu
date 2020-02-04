package chatBotNlpBhortiBondhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {
	
	
	public static Connection connectorDB() throws ClassNotFoundException, SQLException{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username = "root";
		String password ="123susmydb";
		String url ="jdbc:mysql://localhost:3306/bhortibondhudb";
		
		
        Connection conn = DriverManager.getConnection(url,username,password);
		
		
		return conn;
		
		
	}
	

}
