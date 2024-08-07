package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class joinop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement st = con.createStatement();
			
			System.out.println("Retrieving Data");
			
			ResultSet rs = st.executeQuery("select * from Stud_det join Dept_det On Stud_det.id = Dept_det.Did;");
			//Inner Join , Outer Join , Left Join , right Join
			while(rs.next())
			{
				System.out.println("ID :"+rs.getInt(1)+" Name :"+rs.getString(2)+"ID :"+rs.getInt(1)+" DName :"+rs.getString(3));
			}
			
			
			
		} 
		catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		}


	}

}
