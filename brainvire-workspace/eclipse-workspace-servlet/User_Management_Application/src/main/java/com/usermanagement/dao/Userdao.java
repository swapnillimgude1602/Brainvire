package com.usermanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.usermanagement.Model.User;

public class Userdao {
	private static final String INSERT_USERS_SQL = "insert into users" + "(name,email,country) values" + "(?,?,?);";
	private static final String SELECT_USERS_BY_ID = "select id,name,country from users where id=?;";
	private static final String SELECT_ALL_USERS = "select * from users;";
	private static final String DELETE_USERS = "delete from users where id=?;";
	private static final String UPDATE_USERS = "update users set name=?,email=?,country=? where id=?";

	public Userdao() {

	}

	protected Connection getConnection() {
		Connection conn = null; // cause we have to return
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/UserManagement?verifyServerCertificate=false&useSSL=true", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Exception Occured: " + e);
		}
		return conn;
	}

//insert user
	public void insertUser(User user) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(INSERT_USERS_SQL)) { // try
																													// with
																													// resourse
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getEmailId());
			ps.setString(3, user.getCountry());
			System.out.println(ps);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

//select user by id
	public User selectUser(int id) {
		User user = null;
		try (Connection conn = getConnection();
				// stmt creation
				PreparedStatement ps = conn.prepareStatement(SELECT_USERS_BY_ID);) {
			ps.setInt(1, id);
			System.out.println(ps);
			// execute querry
			ResultSet rs = ps.executeQuery();

			// resultset obj process
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				user = new User(id, name, email, country);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return user;
	}

//select all users
	public List<User> selectAllUser() {
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(ps);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				users.add(new User(id,name, email, country));

			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return users;

	}

//update user
	public boolean updateUser(User user) throws SQLException {
		boolean rowUpdated;
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(UPDATE_USERS);) {
			System.out.println("update user" + ps);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getEmailId());
			ps.setString(3, user.getCountry());
			ps.setInt(4, user.getUserId());

			rowUpdated = ps.executeUpdate() > 0;
		}
		return rowUpdated;
	}

//delete user
	public boolean deleteUser(int id) throws SQLException {

		boolean userDeleted;
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(DELETE_USERS);) {
			ps.setInt(1, id);
			userDeleted = ps.executeUpdate() > 0;

		}

		return userDeleted;

	}
}
