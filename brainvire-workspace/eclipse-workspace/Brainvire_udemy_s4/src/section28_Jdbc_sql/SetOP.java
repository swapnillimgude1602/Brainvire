package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SetOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			Statement st = con.createStatement();
			
			System.out.println("Retrieving Data");
			
			ResultSet rs = st.executeQuery("select * from Dept_det where Dname = 'it' union select * from Dept_det2 where Dname='co' ");
			//unionall,Intersect,Excepts
			while(rs.next())
			{
				System.out.println("ID :"+rs.getInt(1)+" Name :"+rs.getString(2));
			}
			
			
			
		} 
		catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		}

	}

}
