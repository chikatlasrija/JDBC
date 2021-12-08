
package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Emp1 {

	public static void main(String[] args) {
				
				try {
			    	  //1 connection create
			    	  Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
			    	  System.out.println("connection created");
			    	  //2 create statement
			    	  Statement mystmt=(Statement) mycon.createStatement();
			    	  
			    	  //3 query execute
			    	   int rs= mystmt.executeUpdate("INSERT INTO `mydatabase`.`employee` (`empid`, `empname`, `emprole`, `empsalry`) VALUES ('6', 'pk', 'pic', '4500')");
			    	   		
				}catch(Exception e)
			      {
			      e.printStackTrace();
			      }
			      
				}

			}




		// TODO Auto-generated method stub

	}

}
