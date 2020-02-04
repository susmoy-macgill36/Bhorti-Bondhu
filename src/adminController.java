

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chatBotNlpBhortiBondhu.AdminDbUtil;
import chatBotNlpBhortiBondhu.AdminInfoModel;

@WebServlet("/adminController")
public class adminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public AdminInfoModel ad;
	
	public List<AdminInfoModel> lp;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doG et(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
    String c1 = request.getParameter("adminuname");
		
		
	String c2 = request.getParameter("adminpass");
	
		
	
		    AdminDbUtil aa = new AdminDbUtil();
		
		
			
			try {
				ad = aa.nameAndPass(c1);
				//request.setAttribute("ad", ad);
				
				HttpSession session=request.getSession();  
		        session.setAttribute("ad", ad); 
		        
				String a1 = (String)ad.getUsername();
				String a2 = (String) ad.getPassword();
				
				 
				lp = aa.showTable();			
				//request.setAttribute("lp", lp);
				session.setAttribute("lp", lp); 
				
					
			    if (a1.equals(c1) && a2.equals(c2)){
			    	RequestDispatcher d = request.getRequestDispatcher("adminView.jsp");
			    	d.forward(request, response);
			    }
			    else{
			    	//RequestDispatcher d1 = request.getRequestDispatcher("index.jsp");
			    	//d1.forward(request, response);
			    	
			    	response.sendRedirect("index.jsp");
			    }
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
/////////////////////////////////////////////////////////
		
			
		
		
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request,response);
	}

}
