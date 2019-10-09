package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.PreparedStatement;

public class StudentDB {

	public StudentDB() {
		
	}
	
	public void addStudent(String fname, String lname, int dob, String email, int phone) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
			
			 String query = " insert into student (firstname, lastname, email, phone, DOB)"
				        + " values (?, ?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
				      preparedStmt.setString (1, fname);
				      preparedStmt.setString (2, lname);
				      preparedStmt.setString   (3, email);
				      preparedStmt.setInt  (4, phone);
				      preparedStmt.setInt    (5, dob);

				      // execute the preparedstatement
				      preparedStmt.execute();
				      
				      con.close();
				    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeStudent(String fname, String lname, int dob, String email, int phone) {
		try  {
		      // create the mysql database connection
			  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
			
		      // create the mysql delete statement.
		      // i'm deleting the row where the id is "3", which corresponds to my
		      // "Barney Rubble" record.
		      String query = "delete from student where email = ?";
		      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString(1, email);

		      // execute the preparedstatement
		      preparedStmt.execute();
		      
		      con.close();
		    }
		    catch (Exception e)
		    {
		      System.err.println("Got an exception! ");
		      System.err.println(e.getMessage());
		    }
	}
}
