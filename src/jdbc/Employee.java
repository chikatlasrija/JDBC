package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Employee {

	public static void main(String[] args) {
		
		try {
	    	  //1 connection create
	    	  Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
	    	  System.out.println("connection established");
	    	  //2 create statement
	    	  Statement mystate=(Statement) mycon.createStatement();
	    	  //3 query update
	    	  int rs=mystate.executeUpdate("INSERT INTO `mydatabase`.`employee` (`empid`, `empname`, `emprole`, `empsalry`) VALUES ('56', 'p', 'soft', '9089')");
	    	 
		  }catch(Exception e)
	      {
	      e.printStackTrace();
	      }
	      
		}

	}
