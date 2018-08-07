

import java.sql.*;

public class mysqldb {
	void show()
	{
	
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost/nametable","root","");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from nametable");  
			while(rs.next())  
			{
				String username=rs.getString(1);
				String password=rs.getString(2);
			System.out.println(username+"  "+password); 
			}
			con.close();  
			}catch(Exception e){ System.out.println(e);
			
			}  
		}
	
	public static void main(String args[]){  
	mysqldb s=new mysqldb();
	s.show();
}
}

