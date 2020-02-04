

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import chatBotNlpBhortiBondhu.userInfoDbUtil;
import chatBotNlpBhortiBondhu.userInfoModel;

/**
 * Servlet implementation class userLogin
 */
@WebServlet("/userLogin")
public class userLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter x = response.getWriter();
		
		x.print("hiiiiiiiiii");
		
		
		String b1 = request.getParameter("sname");
		String b2 = request.getParameter("spass");
		
	
		x.print(b1);
		x.print(b2);
		
		userInfoModel uu = new userInfoModel();
		userInfoDbUtil ud = new userInfoDbUtil();
		
		
		
		try {
			uu = ud.nameAndPass1(b1);
			//request.setAttribute("uu", uu);
			
			 HttpSession session=request.getSession();  
			 session.setAttribute("uu", uu);
			
			String a1 = (String)uu.getRegEmail();
			String a2 = (String)uu.getRegPass();
			
			x.print("\n");
			
			x.print(a1); 
			x.print(a2);
		
		
			
			if(b1.equals(a1) && b2.equals(a2)){
				
				RequestDispatcher df = request.getRequestDispatcher("chatPageView.jsp");
				df.forward(request, response);
			}
			
			else{
				//RequestDispatcher df1 = request.getRequestDispatcher("index.jsp");
				//df1.forward(request, response);
				response.sendRedirect("index.jsp");
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
