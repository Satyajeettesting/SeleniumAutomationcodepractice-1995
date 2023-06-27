package FirstTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseCon {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		//DriverManager.getConnection("jdbc:type of database://ruuning in same machine:portnumber/databasename","root","root");
		if(con.isClosed()) {
			System.out.println("we have not connected to the database");
		}
			else {
				System.out.println("We have successfully connected to the Database");
				
			}
			}
		}
		

	


