package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ApplicationRun {

	public static void main(String[] args) {
		try{
			
			//1. Get connection
			Connection jdbcConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ttn_test","root","R00t_Passw0rd");
			//2. Create a statement
			Statement sqlStatement = jdbcConnection.createStatement();
			//3. Execute SQL query
			ResultSet myResultSet = sqlStatement.executeQuery("Select * from ttn_user");
			//4. Process the result set
			while(myResultSet.next())
			{
				System.out.println(myResultSet.getString("username"));
			}
		}
		catch(Exception e)
		{
			
		}

	}

}
