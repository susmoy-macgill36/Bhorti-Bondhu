package chatBotNlpBhortiBondhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class asa {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		
		String usern = "Susmoy13";
		String x = null,y = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String username = "root";
		String password ="123susmydb";
		String url ="jdbc:mysql://localhost:3306/bhortibondhudb";
		String query  ="select adFullName, pass from adminInfo where adUserName=?";
		
        Connection conn = DriverManager.getConnection(url,username,password);
        
        
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, usern);
        
		
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()){
        	
        	
        	x=rs.getString("adFullName");
        	
        	y=rs.getString("pass");
        	
        }
		
        
		
		conn.close();
		
		
		System.out.print(x);
		System.out.print(y);

	}

}
