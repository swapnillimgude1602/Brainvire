package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dml_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement st = conn.createStatement();

			System.out.println("Inserting records");
			st.executeUpdate("insert into  stud2 values(1,'swapnil','Pune',1234567890)");

			ResultSet rs = st.executeQuery("Select * from stud2");
			while (rs.next()) {
				System.out.println("Roll NO :" + rs.getInt("rollno") + " Name :" + rs.getString("name") + " Address :"
						+ rs.getString("address") + " Phone no :" + rs.getString("phn"));
			}
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}
}
