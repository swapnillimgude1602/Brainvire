package com.backend.reglog;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Register")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		//get values by user
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String gender = req.getParameter("gen1");
		String city = req.getParameter("city");
		
		//passing values to database
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","root");
			
			PreparedStatement ps = conn.prepareStatement("insert into reg values(?,?,?,?,?)");	//?-positional Parameters
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, gender);
			ps.setString(5, city);
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				resp.setContentType("text/html");
				out.println("<h3 style = 'color:blue'>-- User Register Successfully --</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
				rd.include(req, resp);
			}
			else
			{
				resp.setContentType("text/html");
				out.println("<h3 style = 'color:Red'>-- User Not Register --</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
				rd.include(req, resp);
			}
		}
		catch(Exception e)
		{
			resp.setContentType("text/html");
			out.println("<h3 style = 'color:Red'>Exception Occured: "+e+"</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/Register.jsp");
			rd.include(req, resp);
			
		}
	}

}
