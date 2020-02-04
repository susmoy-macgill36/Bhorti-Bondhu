package chatBotNlpBhortiBondhu;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dataset1DbUtil {
	
	public void insertDataset1(String question, String answer)throws ClassNotFoundException, SQLException{
		
		
		
		String query  ="insert into dataset1(dQuestion,dAnswer) values (?,?)";
		
		
		PreparedStatement ps = dbConnect.connectorDB().prepareStatement(query);
		  ps.setString(1, question);
		   ps.setString(2, answer);
	       ps.executeUpdate();
		
		
	       
		
		
		
	}
	
	
	
public void updateDataset1(String question1, String answer1)throws ClassNotFoundException, SQLException{
		
		
		
		String query  ="update dataset1 set dAnswer= ? where dQuestion= ?";
		
		
		PreparedStatement ps = dbConnect.connectorDB().prepareStatement(query);
		  ps.setString(1, answer1);
		   ps.setString(2,question1 );
	       ps.executeUpdate();
		
		
	       
		
		
		
	}
public void deleteDataset1(String question2)throws ClassNotFoundException, SQLException{
	
	
	
	String query  ="delete from dataset1 where dQuestion= ?";
	
	
	PreparedStatement ps = dbConnect.connectorDB().prepareStatement(query);
	 
	   ps.setString(1,question2 );
       ps.executeUpdate();
	
	
       
	
	
	
}



	
public List<Dataset1Model> showTable1() throws ClassNotFoundException, SQLException{
	
	
	ArrayList<Dataset1Model> dd = new ArrayList<>();
	
	String query  ="select * from dataset1";
	
	
	Statement st1 = dbConnect.connectorDB().createStatement();
	
	
	ResultSet rs1 = st1.executeQuery(query);
	while(rs1.next()){
		Dataset1Model a1 = new Dataset1Model();
		
		
        
    	
    	a1.setId(rs1.getInt("dID"));
    	a1.setQues(rs1.getString("dQuestion"));
    	
    	a1.setAns(rs1.getString("dQuestion"));
    	
    	
    	dd.add(a1);
	
	}
	
	
	
	
	return dd;
	
	
	
}

	
	
	
	
	
	
	
	


}
