package com.everis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String Driver = "org.postgresql.Driver";

	public Connection getConnection(String url, String user, String password)
			throws ClassNotFoundException, SQLException {

		Class.forName(Driver);
		return DriverManager.getConnection(url, user, password);

	}

}
