package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Scanner s = new Scanner(System.in);
//    	System.out.println("enter name");
//    	String custname = s.next();
//    	System.out.println("enter phone");
//    	String custPhone = s.next();
        try {
        	
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3305/c1236","root","jesus7358");
        	////create statement
        	Statement stmt = con.createStatement();
        	
        	//PreparedStatement stmt;
        	////inserting data in db table
        	//stmt.executeUpdate("insert into customer values(7,'divya','763462')");  
        	
        	//updating an existing record
        	//stmt.executeUpdate("update customer set customerphone = '99984' where customerid = '2'");
//        	System.out.println("updated successfully");
//        	con.close();
        	
        	//delete record
//        	stmt.executeUpdate("delete from customer where customerid = '9' ");
//        	System.out.println("deleted successfully");
//        	con.close();
        	
        	//execute query, fetch data from DB table
//			ResultSet rs = stmt.executeQuery("select * from customer where customername = 'ram'");
        	ResultSet rs = stmt.executeQuery("select * from customer order by customername");
			
			//iteration
			while(rs.next())
				System.out.println("customer id : "+rs.getInt(1)+ " customer name : "+ rs.getString(2)+ " customer phone : "+rs.getString(3));
			
        	
//        	String sql = "insert into customer values(8,?,?)";
//        	stmt = con.prepareStatement(sql);
//        	stmt.setString(1,custname);
//        	stmt.setString(2,custPhone);
//        	stmt.execute();
//        	System.out.println("inserted successfully");
//        	con.close();
        	
        }
        catch(Exception e) {
        	System.out.println(e);
        }
    }
}
