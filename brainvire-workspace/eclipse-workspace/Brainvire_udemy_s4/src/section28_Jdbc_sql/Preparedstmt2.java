package section28_Jdbc_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Preparedstmt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into Stud_det values(?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id:  Name:  Dept name: ");
			
			int id = sc.nextInt();
			String name = sc.next();
			String Dname = sc.next();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, Dname);
			
			int i = ps.executeUpdate();
			PreparedStatement ps1 = con.prepareStatement("select * from Stud_det");
			
			ResultSet rs = ps1.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			con.close();
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e);
		}

	}

}
