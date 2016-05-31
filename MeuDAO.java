package crud;

import java.sql.*;

public class MeuDAO
{
	public Connection con;
	public PreparedStatement pstmt;
	public Statement stmt;
	public ResultSet rs;

	public void OpenDatabase() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver").newInstance();

		String url = "jdbc:mysql://localhost:3306/crud_java?user=root&password=";
		con = DriverManager.getConnection(url);
	}

	public void CloseDatabase() throws Exception
	{
		if (con != null)
			con.close();
	}
}
