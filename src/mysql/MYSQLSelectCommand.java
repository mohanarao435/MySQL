package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLSelectCommand {

	public static void main(String[] args) throws SQLException {
		
		//1)create a connection
		
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb1","root","root");
				
		//2)create Statement/Query
				
			Statement stmt=conn.createStatement();
				
	
				
			String s="SELECT * FROM STUDENT";
				
		//3,4)execute Statement/Query and Store data in resultset
			ResultSet rs=stmt.executeQuery(s);
			
			while(rs.next())
			{
				int sid=rs.getInt("S_ID");
				String sname=rs.getString("S_NAME");
				int deptid=rs.getInt("DEPARTMENT_ID");
				
				System.out.println(sid+"  "+sname+"  "+deptid);
			}
			
				
		//4)close connection
				
				conn.close();
				
				System.out.println("Query executed...");

	}

}
