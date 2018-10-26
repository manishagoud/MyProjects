import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int number = Integer.parseInt(request.getParameter("eno"));
		String name = request.getParameter("ename");
		double salary = Double.parseDouble(request.getParameter("esal"));
		PrintWriter out = response.getWriter();
		/* out.println("<HTML><h1>" + number+ "</h1></HTML>"); */

		out.println(number);
		out.println(name);
		out.println(salary);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
