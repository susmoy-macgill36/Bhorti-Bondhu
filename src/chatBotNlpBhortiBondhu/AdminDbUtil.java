package chatBotNlpBhortiBondhu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class AdminDbUtil {
	
	
	
	
	public  AdminInfoModel nameAndPass(String name) throws Exception{
		
		
		
		
		
		AdminInfoModel a = new AdminInfoModel();
		
		
		//Class.forName("com.mysql.cj.jdbc.Driver");
		//String username = "root";
		//String password ="123susmydb";
		//String url ="jdbc:mysql://localhost:3306/bhortibondhudb";
		//String query  ="select adUserName, pass from adminInfo where adUserName=?";
		
        //Connection conn = DriverManager.getConnection(url,username,password);
       // PreparedStatement ps = conn.prepareStatement(query);
		String query  ="select adUserName, pass from adminInfo where adUserName=?";
		PreparedStatement ps = dbConnect.connectorDB().prepareStatement(query);		
		
        ps.setString(1, name);
        
		
        
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()){
        	
        	
        	a.setUsername(rs.getString("adUserName"));
        	
        	a.setPassword(rs.getString("pass"));
        	
        }
		
       
		
		
		
		
		
		
		return a;
		
		
	
		
	}
	
	
	
	public List<AdminInfoModel> showTable() throws ClassNotFoundException, SQLException{
		
		
		ArrayList<AdminInfoModel> dd = new ArrayList<>();
		
		String query  ="select * from adminInfo";
		
		
		Statement st1 = dbConnect.connectorDB().createStatement();
		
		
		ResultSet rs1 = st1.executeQuery(query);
		while(rs1.next()){
			AdminInfoModel a1 = new AdminInfoModel();
			
			
            a1.setUsername(rs1.getString("adUserName"));
        	
        	a1.setPassword(rs1.getString("pass"));	
        	
        	a1.setFullName(rs1.getString("adFullName"));
        	
        	a1.setEmail(rs1.getString("adEmail"));
        	
        	
        	dd.add(a1);
		
		}
		
		
		
		
		return dd;
		
		
		
	}
	

}
