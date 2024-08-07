package com.backend.reglog;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");


		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration","root","root");
			
			PreparedStatement ps = conn.prepareStatement("select * from reg where email=? and passoword=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())	
			{
				HttpSession hs = request.getSession();
				hs.setAttribute("session_name", rs.getString("name"));
				RequestDispatcher rd = request.getRequestDispatcher("/userProfile.jsp");
				rd.include(request, response);

			}

			else {
			out.println("<h3 style = 'color:Red'>--Email or Password didn't Matched--</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			}
		}
		catch(Exception e)
		{
			out.println("<h3 style = 'color:Red'>--Email or Password didn't Matched--"+e.getMessage()+"</h3>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			
		}

	}

}
