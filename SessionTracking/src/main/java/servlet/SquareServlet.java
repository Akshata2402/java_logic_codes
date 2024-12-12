package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {
     
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   resp.setContentType("text/html");
           HttpSession session=req.getSession();
           
           int addition=(int)session.getAttribute("addition");
           
           int square=addition*addition;
           
           PrintWriter out= resp.getWriter();
           
           out.println("<html >");
           out.println("<head >");
           out.println("<title>Response page</title>");
           out.println("</head>");
           out.println("<body>");
           out.println("<h1>"+square+"</h1>");
           out.println("</body>");
           out.println("</html>");


	
	}
	
}
