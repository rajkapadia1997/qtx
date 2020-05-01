package DatabaseProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseQuerie {
	String dbUrl = "jdbc:mysql://localhost:3306/sakila";
	String username = "root";
	String password = "rajkapadia.net";

	@Test
	public void GetFilmTitles() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT *\n" + "FROM film\n" + "WHERE title LIKE '%airplane%'");

		con.close();

	}

	@Test
	public void GetInventoryId() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();

		stmt.executeQuery("set @p_film_count = 0;");
		stmt.executeQuery("call sakila.film_in_stock(15, 2, @p_film_count);");

		con.close();
	}

	@Test
	public void UpdateTimeStamp() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("update store\n" + "set last_update=now()\n" + "where store_id=7;");

		con.close();
	}

	@Test
	public void DeleteNewStore() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl, username, password);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from store\n" + "where store_id=7");

		con.close();
	}

}
