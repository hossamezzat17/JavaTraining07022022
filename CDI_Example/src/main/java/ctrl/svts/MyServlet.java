package ctrl.svts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private Customer customer01;
	
	@Inject
	private Customer customer02;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		htmlOpen(response.getWriter());
		
		System.out.println(request.getSession().isNew());
		

		customer01.setFirstname("Christian");
		
		customer01.setCount(customer01.getCount()+1);
		
		response.getWriter().println("<h2>" + customer01 + "</h2>");
		response.getWriter().println("<h2>" + customer01.hashCode() + "</h2>");
		response.getWriter().println("<h2>" + customer01.getClass() + "</h2>");
		response.getWriter().println("<h2>" + customer01.getCount() + "</h2>");
		
		
		response.getWriter().println("<h2>" + customer02 + "</h2>");
		response.getWriter().println("<h2>" + customer02.hashCode() + "</h2>");
		response.getWriter().println("<h2>" + customer02.getClass() + "</h2>");
		response.getWriter().println("<h2>" + customer02.getCount() + "</h2>");
		
		String url = "MyServlet";
		String encodedURL = response.encodeURL(url);
		response.getWriter().println("<a href=\" " + encodedURL + "  \"> MyServlet</a>");
		
		htmlClose(response.getWriter());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	/**
	 * Hilfsmethode zum erzeugen der Statischen HTML Elemente
	 */
	private void htmlOpen(PrintWriter out) {
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"ISO-8859-1\">");
		out.write("<style>\r\n" + "h1 {color:red;}" + "h2 {color:black;}" + "h3 {color:steelblue;}" + "</style>");
		out.write("<title>Unser Servlet</title>");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1>CDI</h1>");
		out.flush();
	}

	/**
	 * Hilfsmethode zum erzeugen der Statischen HTML Elemente
	 */
	private void htmlClose(PrintWriter out) {
		
		
		
		out.write("<a href=\"MyServlet\"> MyServlet</a>");
		out.write("</body>");
		out.write("</html>");
		out.flush();
	}

}
