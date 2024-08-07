package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AggregateFn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement st = con.createStatement();
			
			System.out.println("Aggregate functions");
			
			ResultSet rs = st.executeQuery("Select count(*) from Stud_det");	//max,sum,min,avg
			while(rs.next())
			{
				int cnt=rs.getInt(1);
				System.out.println(cnt);
			}
		
			
			
		} 
		catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		}


	}

}
