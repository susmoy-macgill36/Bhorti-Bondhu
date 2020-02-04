

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chatBotNlpBhortiBondhu.AdminInfoModel;
import chatBotNlpBhortiBondhu.userInfoDbUtil;
import chatBotNlpBhortiBondhu.userInfoModel;

/**
 * Servlet implementation class userController
 */
@WebServlet("/userController")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public userInfoModel ax;
	


	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 String regName = (String)request.getParameter("regname");
	 String pass = (String)request.getParameter("regpass");
	
    userInfoDbUtil	 u1 = new userInfoDbUtil();
    
 
    	
    	
        try {
    		u1.insertUserInfo(regName, pass);
    		
    		
    		
    		RequestDispatcher rr = request.getRequestDispatcher("index.jsp");
    		rr.forward(request,response);
    		
    		
    	} catch (ClassNotFoundException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	
    	
    
     
 

   
	/////////////////////////////////////////////////////////////
   
		
		
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		doGet(request,response);
		
	}

}
