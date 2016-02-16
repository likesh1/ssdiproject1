package ssdi_project;

import java.sql.*;

public class DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//get connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssdi","root","password");
			//create statements
					Statement myStmt = myConn.createStatement();
			//executeSQL queries
			ResultSet myRs = myStmt.executeQuery( "select * from Persons");
			//process the result set
				while (myRs.next()) {
					System.out.println(myRs.getString("P_Id")+","+ myRs.getString("Pname")+ ","+myRs.getString("EmailId")+","+myRs.getString("City"));
				}
		}catch (Exception exc) {
			exc.printStackTrace();
		}
	}

}
