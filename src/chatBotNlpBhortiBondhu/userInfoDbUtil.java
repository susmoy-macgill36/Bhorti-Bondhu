package chatBotNlpBhortiBondhu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userInfoDbUtil {

	
	
	
	public void insertUserInfo(String em, String pas) throws ClassNotFoundException, SQLException{
		
		
		String query  ="insert into userInfo(uEmail ,uPass) values (?,?)";
		PreparedStatement ps = dbConnect.connectorDB().prepareStatement(query);		
		
		   ps.setString(1, em);
		   ps.setString(2, pas);
	       ps.executeUpdate();
		
	       
	       
		
		
		
		
	}
	
public userInfoModel nameAndPass1(String em) throws Exception{
		
		
		
		
		
		userInfoModel a7 = new userInfoModel();
		
	
		String query  ="select uEmail,uPass from userInfo where uEmail=?";
		PreparedStatement ps = dbConnect.connectorDB().prepareStatement(query);		
		
        ps.setString(1, em);
        
		
        
        
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()){
        	
       
        	
        	a7.setRegEmail(rs.getString("uEmail"));
        	a7.setRegPass(rs.getString("uPass"));
        	
        }
		
       
		
		
		
		
		
		
		return a7;
		
		
	
		
	}
	
	
	
	
	
	
}
