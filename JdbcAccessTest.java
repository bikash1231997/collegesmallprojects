/*import java.sql.*;

try{
	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
	*/
	
	
	
	import java.sql.*;
	import java.sql.Connection; import java.sql.DriverManager; import java.sql.SQLException; import java.util.Properties;

 

public class JdbcAccessTest
 {
 
    public static void main(String[] args)
	{
		 try 
		 {  
            // loading thejdbc odbc driver  
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
            // creating connection toth data base  
            Connection con = DriverManager.getConnection("jdbc:odbc:mydsn", "", "");  
            Statement st = con.createStatement();  
            // create an execute sql command on database      
            ResultSet rs = st.executeQuery("Select * from student order by rollno asc");  
            ResultSetMetaData rsmd = rs.getMetaData();  
            // this getColumnCount reurn the number of column in the selected table  
            int numberOfColumns = rsmd.getColumnCount();  
            // while loop and with while loop code use for print the data  
            while (rs.next()) 
			{  
                for (int i = 1; i <= numberOfColumns; i++)
					{  
                    if (i > 1)  
                        System.out.print(", ");  
                    String columnValue = rs.getString(i);  
                    System.out.print(columnValue);  
					}  
                System.out.println("");  
            }  
            st.close();  
            con.close();  
        } 
		catch (Exception ex)
		{  
            System.err.print("Exception: ");  
            System.err.println(ex.getMessage());  
		}
         
    }  
}
         
     /*   String databaseURL = "D:/progs/Database1.accdb";
         
        try (Connection connection = DriverManager.getConnection(databaseURL)) 
		{
             
             
            String sql = "(name, roll, dob) (?, ?, ?)";
             
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Jim Rohn");
            preparedStatement.setString(2, "rohnj@herbalife.com");
            preparedStatement.setString(3, "0919989998");
             
            int row = preparedStatement.executeUpdate();
             
            if (row > 0) {
                System.out.println("A row has been inserted successfully.");
            }
             
            sql = "SELECT * FROM Contacts";
             
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                int id = result.getInt("Contact_ID");
                String fullname = result.getString("Full_Name");
                String email = result.getString("Email");
                String phone = result.getString("Phone");
                 
                System.out.println(id + ", " + fullname + ", " + email + ", " + phone);
            }
             
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}*/