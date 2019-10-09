package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModuleGradeDB {
	public void addModule(String name, String code) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
			
			 String query = " insert into modulegrade (modulecode, modulename)"
				        + " values (?, ?)";

				      // create the mysql insert preparedstatement
				      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
				      preparedStmt.setString (1, code);
				      preparedStmt.setString (2, name);

				      // execute the preparedstatement
				      preparedStmt.execute();
				      
				      con.close();
				    
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeModule(String name, String code) {
		try  {
		      // create the mysql database connection
			  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
			
		      // create the mysql delete statement.
		      // i'm deleting the row where the id is "3", which corresponds to my
		      // "Barney Rubble" record.
		      String query = "delete from modulegrade where modulecode = ?";
		      java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString(1, code);

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
