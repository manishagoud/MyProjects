
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/Login")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("HTML");
		PrintWriter out= response.getWriter();
		
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String user=request.getParameter("username");
		String pswd=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("number");
		
	}

	
	
	}


