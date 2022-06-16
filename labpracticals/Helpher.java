package com.MavenLabEg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helpher {
	
	static {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
	}
		catch(Exception e) {
			System.out.println(e);
			}
		}
	public static Connection con()throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://Localhost:3305/maveneg","root","jesus7358");
	}
}
