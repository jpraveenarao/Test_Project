package testing;
//Connecting to MySql database add MySql dependency in POM 

import java.sql.*;

public class MysqlCon {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "admin");
              //here classicmodels is database name, root is username and password admin  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customers");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+""+rs.getString(4));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
