package JDBC;

import java.sql.*;

public class TestApp2 {

	public static void main(String[] args) throws SQLException {
	
		//#1Load and register the driver 
		
	/*	Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		System.out.println("Driver registered Succesfully");*/
		
		
		//#2 Establishing  the connection 
		String url = "jdbc:mysql://localhost:3306/enterprisejava";
		String user = "root";
		String password = "Sahil@x786";
		Connection connection = DriverManager.getConnection(url,user,password);
		

		//#3 Statement object to send the query for execution(to move to the location using connection)
		
		
		Statement statement = connection.createStatement();
		
		
		//#4 using statement object to execute the query
		

        String sqlSelectQuery = "select sid,sname,sage,saddr from Student ";
		
		ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
		
		
		
		//#5  Process the result to get the data 
		
		while(resultSet.next()) {
			
			int sid = resultSet.getInt("sid");
			String name = resultSet.getString("sname");
			int sage = resultSet.getInt("sage");
			String add = resultSet.getString("saddr");
			System.out.println(sid + "\t" + name + "\t" + sage + "\t" + add);
		}
		
		
		//#6 close the connection 
		resultSet.close();
		statement.close();
		connection.close();
		
	}

}




//Driver manager is coming from sql package , all this is present in rt.jar it is a part of jdk software
//Driver is not available in rt.jar , it is available in third party software which is given by respective db vendor
 