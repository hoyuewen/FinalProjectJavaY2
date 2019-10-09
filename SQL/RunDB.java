/*
 * RunDB.java
 *
 * 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author 
 */
public class RunDB {
    
    /** Creates a new instance of RunDB */
    public RunDB() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
	
            
               
        
         Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        
        
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/schema?user=root&password=" );
        System.out.println ("Database connection established");
        Statement s = con.createStatement ();
        
       
        

        }catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
            
        };
    
    }
    
}
