

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
 * Servlet implementation class Dataset1Controller
 */
@WebServlet("/Dataset1Controller")
public class Dataset1Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dataset1Controller() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		// TODO Auto-generated method stub
PrintWriter  rr =  response.getWriter();
		
		rr.print("hiiiiiiiii");
		
		
		String vv1 =(String) request.getParameter("question");
		
		String vv2 = (String)request.getParameter("answer");
		
		rr.print(vv1);
		rr.print(vv2);
		
		//u1.insertUserInfo(regName, pass);
		
		Dataset1DbUtil ds = new Dataset1DbUtil();
		
		
		try {
			ds.insertDataset1(vv1, vv2);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("adminView.jsp");
	}

}
