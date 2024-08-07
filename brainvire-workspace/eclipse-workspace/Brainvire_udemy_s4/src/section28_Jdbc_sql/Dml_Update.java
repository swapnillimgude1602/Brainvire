package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dml_Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement st = con.createStatement();
			
			System.out.println("Updating Data...");
			String s = "update Stud_det set Sname = 'Swapnil' where id=3";
			st.executeUpdate(s);
			
			ResultSet rs = st.executeQuery("Select * from Stud_det");
			while(rs.next())
			{
				System.out.println("ID :"+rs.getInt("id")+" Name :"+rs.getString("Sname")+" Dept :"+rs.getString("Dname"));
			}
		
			
			
		} 
		catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		}

	}

}
