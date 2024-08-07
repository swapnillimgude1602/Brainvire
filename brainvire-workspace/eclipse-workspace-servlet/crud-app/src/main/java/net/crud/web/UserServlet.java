package net.crud.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.crud.dao.UserDao;
import net.crud.model.User;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserDao userdao;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public void init() {
		userdao = new UserDao();
	}
 
    public UserServlet() {
        this.userdao=new UserDao();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertUser(request, response);
				break;
			case "/delete":
				deleteUser(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateUser(request, response);
				break;
			default:
				listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			System.out.println(ex);
			throw new ServletException(ex);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	private void listUser(HttpServletRequest req,HttpServletResponse res) throws SQLException, ServletException, IOException {
		List<User> listUser = userdao.SelectAllUsers();
		req.setAttribute("listUser", listUser);
		RequestDispatcher dis = req.getRequestDispatcher("user-list.jsp");
		dis.forward(req, res);
	}
	
	
	private void showNewForm(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(req, res);
	}
	
	
	private void insertUser(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String country = req.getParameter("country");
			User newUser = new User(name, email, country);
			userdao.insertUser(newUser);
			res.sendRedirect("list");
		
	}
	
	
	private void deleteUser(HttpServletRequest req, HttpServletResponse res) throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		userdao.deleteUser(id);
		res.sendRedirect("list");
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		User existingUser = userdao.selectUser(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);

	}


	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");

		User book = new User(id, name, email, country);
		userdao.updateUser(book);
		response.sendRedirect("list");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
