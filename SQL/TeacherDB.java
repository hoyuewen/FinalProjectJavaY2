package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherDB {
	public void addTeacher(String fname, String lname, String mname, String qualification, String email, int phone) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );

			String query = " insert into Teacher (email, firstname, middlename, lastname, telNo, qualification)"
					+ " values (?, ?, ?, ?, ?, ?)";

			// create the mysql insert preparedstatement
			java.sql.PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString (1, email);
			preparedStmt.setString (2, fname);
			preparedStmt.setString (3, mname);
			preparedStmt.setString   (4, lname);
			preparedStmt.setInt  (5, phone);
			preparedStmt.setString    (6, qualification);

			// execute the preparedstatement
			preparedStmt.execute();

			con.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void removeTeacher(String fname, String lname, String mname, String qualification, String email, int phone) {
		try  {
			// create the mysql database connection
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );

			// create the mysql delete statement.
			// i'm deleting the row where the id is "3", which corresponds to my
			// "Barney Rubble" record.
			String query = "delete from Teacher where email = ?";
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
	public void editDegree(String fname, String lname, String mname, String qualification, String email, int phone) {
		try
		{
			// create a java mysql database connection
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );

			// create the java mysql update preparedstatement
			String query = "update Teacher set qualification = ? where email = ?";
			PreparedStatement preparedStmt = con.prepareStatement(query);
			preparedStmt.setString   (1, qualification);
			preparedStmt.setString(2, email);

			// execute the java preparedstatement
			preparedStmt.executeUpdate();

			con.close();
		}
		catch (Exception e)
		{
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
}
