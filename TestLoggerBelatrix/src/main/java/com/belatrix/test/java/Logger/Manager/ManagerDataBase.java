package com.belatrix.test.java.Logger.Manager;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.belatrix.test.java.Logger.Configuration.Configuration;

public class ManagerDataBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 811784992774959162L;

	private static ManagerDataBase instance = null;
	private Configuration configuration;

	public ManagerDataBase(Configuration belatrixConfiguration) {
		this.configuration = belatrixConfiguration;
	}

	public static synchronized ManagerDataBase getInstance(Configuration belatrixConfiguration) {
		if (instance == null) {
			instance = new ManagerDataBase(belatrixConfiguration);
		}
		return instance;
	}

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(configuration.getProperty("BD.Logger.jdbcDriver"));
			String userName = configuration.getProperty("BD.Logger.UsserName");
			String password = configuration.getProperty("BD.Logger.Password");
			connection = DriverManager.getConnection(configuration.getProperty("BD.Logger.dbUrl"), userName, password);
		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException("Data Base Connection Error.", e);
		}
		return connection;
	}

	public Statement getStatment(Connection connection) {
		try {
			return connection.createStatement();
		} catch (SQLException e) {
			throw new RuntimeException("Statment Connection error.", e);
		}
	}

	public void insertMessageBD(String message, int messageType) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = getConnection();
			statement = getStatment(connection);
			statement.execute("INSERT INTO Log_Values(message, type) VALUES('" + message + "', "
					+ String.valueOf(messageType) + ")");
		} catch (SQLException e) {
			throw new RuntimeException("Insert message BD error.", e);
		}
	}

}
