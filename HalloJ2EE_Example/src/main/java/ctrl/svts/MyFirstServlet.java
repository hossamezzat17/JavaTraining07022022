package ctrl.svts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyFirstServlet
 */
@WebServlet({ "/MyFirstServlet", "/index.html" })
public class MyFirstServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFirstServlet() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response);
			response.getWriter().append("Dies war ein GET Request");
		} else {
			response.getWriter().append("Dies war kein GET Request");
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String queryString = request.getQueryString();
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("Hallo Welt, dies ist HTML aus einem Servlet");
		out.println("</h1>");
		out.println("<h2>");
		out.println("Dies ist eine Überschrift Ebene 2");
		out.println("</h2>");
		out.println("<h3>");
		out.println(queryString);
		out.println("</h3>");
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String parameter = parameterNames.nextElement();
			
			out.println("<h2>" + parameter + " : " + request.getParameter(parameter) + "</h2>");
			
		}
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
