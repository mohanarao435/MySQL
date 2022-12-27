package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLDMLCommands {

	public static void main(String[] args) throws SQLException {
		
		//1)create a connection
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","rootpassword");
		
		//2)create Statement/Query
		Statement stmt=conn.createStatement();
		
		//String s="INSERT INTO STUDENT VALUES(131,'SEHWAG',80)";
		
		//String s="UPDATE STUDENT SET S_NAME='GANGULY' WHERE S_ID=131";
		
		String s="DELETE FROM STUDENT WHERE S_ID=131";
		
		//3)execute Statement/Query
		stmt.execute(s);
		
		//4)close connection
		
		conn.close();
		
		System.out.println("Query executed...");

	}

}
