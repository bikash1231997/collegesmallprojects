import  java.sql.*;

public class Jdbc1
{
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		if(con==null)
		{
			System.out.println("Notconnected");
		}
		else
		{
			System.out.println("connected");
		}
		con.close();
	}
}