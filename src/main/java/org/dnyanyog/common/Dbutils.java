package org.dnyanyog.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbutils {

	private static Connection connection;
	private static Statement statement;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://Localhost:3306/userdatabase", " root", "Sia@0120");
			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet executeSelectQuery(String query) throws SQLException {
		ResultSet result = statement.executeQuery(query);

		return result;
	}

	public static void executeQuery(String query) throws Exception {

		statement.execute(query);
	}

}
