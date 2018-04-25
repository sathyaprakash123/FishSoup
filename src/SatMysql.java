



import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SatMysql {
	
	public Connection con;
	Statement stmt;
	ResultSet rs;
	
	SatMysql() throws ClassNotFoundException, SQLException 
	{
	
	Class.forName("com.mysql.jdbc.Driver"); 
	con = (Connection) DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/testbase","root","sathya");
	stmt=(Statement) con.createStatement();  
	 
	
	}
	
	public void getValues(String name) throws SQLException
	{
		StringBuilder query = new StringBuilder();
		
		query.append("select * from testdata where name =" + "\"" + name + "\"");
		System.out.println(query);
		
		rs=stmt.executeQuery(query.toString());
		while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getString(3));  
			con.close();  
	}
	
	
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		

SatMysql sat = new SatMysql();
sat.getValues("modi");





		}
	
	

}
