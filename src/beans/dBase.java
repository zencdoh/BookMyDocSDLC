package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class dBase {

	private Connection connection;
	private Statement statement;
	private ResultSet results = null;
	@SuppressWarnings("unused")
	private String query;

	public void createConn() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		//connection = DriverManager.getConnection(
				//"jdbc:mysql://35.166.130.227:3306/book_my_doc", "root", "root");
		String URL = ${URL};
                String USER = ${USER};
                String PASS = ${PASS};
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASS);
                Connection connection  = DriverManager.getConnection(URL, USER, PASS);
		//connection = DriverManager.getConnection(
				//"jdbc:mysql://35.166.130.227:3306/book_my_doc", "root", "root");
		statement = connection.createStatement();
	}

	public ResultSet executeQuery(String q) throws SQLException {
		results = statement.executeQuery(q);
		//System.out.println(results);
		return results;
	}
	
	public int executeUpdate(String q) throws SQLException {
	    int result=statement.executeUpdate(q);
		return result;
	}

	public int doUpdate(String query) throws Exception {
		int i = statement.executeUpdate(query);
		return i;
	}

	public ResultSet getData(String query) throws Exception {
		results = statement.executeQuery(query);
		return results;
	}

	public int getRowCount(String query) throws Exception {
		int count = 0;
		results = statement.executeQuery(query);
		while (results.next()) {
			count++;
		}
		return count;
	}

	public void closeConn() throws SQLException {
		statement.close();
		connection.close();
	}
}
