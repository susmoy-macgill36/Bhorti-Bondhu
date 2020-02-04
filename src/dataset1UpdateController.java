

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chatBotNlpBhortiBondhu.Dataset1DbUtil;

/**
 * Servlet implementation class dataset1UpdateController
 */
@WebServlet("/dataset1UpdateController")
public class dataset1UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dataset1UpdateController() {
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
        PrintWriter  rr =  response.getWriter();
		
		rr.print("hiiiiiiiii");
		
		
		String t1 = (String) request.getParameter("upQuestion");
		
		String t2 =(String) request.getParameter("upAnswer");
		
		Dataset1DbUtil ds2 = new Dataset1DbUtil();

		
		
		try {
			ds2.updateDataset1(t1, t2);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("adminView.jsp");
		
	}

}
