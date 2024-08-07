package net.crud.dao;
import net.crud.model.User;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;

public class UserDao {
	private String jdbcurl ="jdbc:mysql://localhost:3306/UserManagement";
	private String jdbcuse="root";
	private String jdbcpass="root";
	
	
	private static final String Insert_Users = "INSERT INTO users" + "  (name, email, country) VALUES "+ " (?, ?, ?);";
	private static final String Select_Users_By_Id = "select id,name,email,country from users where id =?";
	private static final String Select_All_Users = "select * from users";
	private static final String Delete_Users = "delete from users where id=?;";
	private static final String Update_Users = "update users set name = ?,email= ?, country =? where id = ?;";
	
	protected Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(jdbcurl,jdbcuse,jdbcpass);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		return con;
	}
	
	
	public void insertUser(User user) throws SQLException{
		try(Connection con=getConnection();
			PreparedStatement ptsmt=con.prepareStatement(Insert_Users);){
				ptsmt.setString(1, user.getName());
				ptsmt.setString(2, user.getEmail());
				ptsmt.setString(3, user.getCountry());
				ptsmt.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public User selectUser(int id) throws SQLException{
		User user=null;
		try (Connection con = getConnection(); PreparedStatement ptsmt = con.prepareStatement(Select_Users_By_Id);) {
			ptsmt.setInt(1, id);
			ResultSet rs = ptsmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				user = new User(id, name, email, country);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return user;
	}
	
	
	public List<User> SelectAllUsers() throws SQLException{
		List<User> users = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement ptsmt = con.prepareStatement(Select_All_Users);) {
			ResultSet rs = ptsmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				users.add(new User(id, name, email, country));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return users;
	}
	
	
	public boolean updateUser(User user) throws SQLException{
		boolean rowUpdated;
		try(Connection con=getConnection();
			PreparedStatement ptsmt=con.prepareStatement(Update_Users);){
				ptsmt.setString(1, user.getName());
				ptsmt.setString(2, user.getEmail());
				ptsmt.setString(3, user.getCountry());
				ptsmt.setInt(4,user.getId());
				rowUpdated =ptsmt.executeUpdate()>0;
		}
		return rowUpdated;
	}
	
	
	public boolean deleteUser(int id) throws SQLException{
		boolean rowDeleted;
		try(Connection con=getConnection();
			PreparedStatement ptsmt=con.prepareStatement(Delete_Users);){
				ptsmt.setInt(1,id);
				rowDeleted=ptsmt.executeUpdate()>0;
		}
		return rowDeleted;
	}
	
	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
