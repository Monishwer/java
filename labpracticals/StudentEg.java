package com.MavenLabEg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class StudentEg {
	
	Scanner s = new Scanner(System.in);
	int id;
	String studentname, studentphone;
	
	//insert
	
	public void saveStudent() throws SQLException{
		System.out.println("enter student id");
		id = s.nextInt();
		System.out.println("enter student name");
		studentname = s.next();
		System.out.println("enter student phone");
		studentphone = s.next();
		Connection conn = Helpher.con();
		
		PreparedStatement st = conn.prepareStatement("insert into values (?,?,?)");
		st.setInt(1, id);
		st.setString(2, studentname);
		st.setString(3, studentphone);
		st.executeUpdate();
	}
	
	//select
	public void fetchStudent() throws SQLException{
		Connection conn = Helpher.con();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		while(rs.next()) {
			System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3));
		}
	}
	
	//update
	public void updateStudent() throws SQLException{
		Connection conn = Helpher.con();
		Statement st = conn.createStatement();
		System.out.println("enter student id");
		id = s.nextInt();
		System.out.println("enter update student phone");
		studentphone = s.next();
		st.executeUpdate("update student set studentphone = '" + studentphone +"' where studentid = " + id);
	}
	
	//delete
	public void deleteStudent() throws SQLException{
		Connection conn = Helpher.con();
		Statement st = conn.createStatement();
		System.out.println("enter student id");
		id = s.nextInt();
		st.executeUpdate("delete from student where studentid = "+id);
	}
}
