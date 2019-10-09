package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClassGradeDB {
	public void addClass(int id, String email, String classGroup, String moduleCode, float grade) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
			
			 String query = " insert into classgrade (id, email, classgroup, modulecode, grade)"
				        + " values (?, ?, ?, ?, ?)";

				      // create the mysql insert preparedstatement
				      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
				      preparedStmt.setInt (1, id);
				      preparedStmt.setString (2, email);
				      preparedStmt.setString (3, classGroup);
				      preparedStmt.setString (4, moduleCode);
				      preparedStmt.setFloat (5, grade);

				      // execute the preparedstatement
				      preparedStmt.execute();
				      
				      con.close();
				    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeClass(int id, String email, String classGroup, String moduleCode, float grade) {
		try  {
		      // create the mysql database connection
			  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
			
		      // create the mysql delete statement.
		      // i'm deleting the row where the id is "3", which corresponds to my
		      // "Barney Rubble" record.
		      String query = "delete from classgrade where id = ?";
		      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setInt(1, id);

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
