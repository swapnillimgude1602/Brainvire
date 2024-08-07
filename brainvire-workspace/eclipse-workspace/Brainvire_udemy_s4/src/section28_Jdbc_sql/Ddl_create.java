package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ddl_create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement st = con.createStatement();

			System.out.println("Creating Data");
			String s = "create table stud2 (rollno int, name varchar(50), address varchar(100), phn int)";
			st.executeUpdate(s);
		}

		catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		}

	}

}
