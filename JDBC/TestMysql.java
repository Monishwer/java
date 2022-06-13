package comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMysql {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			//register mysql driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//get mysql db connection, mention URL, DBname, username, password
			Connection conn = DriverManager.getConnection("jdbc:mysql://Localhost:3305/c1236","root","jesus7358");
			
			//create statement
			Statement stmt = conn.createStatement();
			
			//execute query, fetch data from DB table
			ResultSet rs = stmt.executeQuery("select * from customer");
			
			//iteration
			while(rs.next())
				System.out.println("customer id : "+rs.getInt(1)+ " customer name : "+ rs.getString(2)+ " customer phone : "+rs.getString(3));
			
			//close mysql db connection
			conn.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
