import  java.sql.*;

public class jdbc2
{
	public static void main(String args[])throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		String s="create table employee10(id number, name varchar(30),job varchar(30), sal number(10,2))";
		Statement st=con.createStatement();
		int k=st.executeUpdate(s);
		if(k==0)
		{
		System.out.println("Table Created...");
		}
		else
		{
		System.out.println("Table Not Created...");
		}
		st.close();
		con.close();
	}
}