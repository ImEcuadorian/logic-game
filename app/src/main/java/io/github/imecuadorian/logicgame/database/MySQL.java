package io.github.imecuadorian.logicgame.database;

import lombok.Getter;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL
	implements Database {

	private static final Logger LOGGER = Logger.getLogger(MySQL.class.getName());
	public static final String URL = "jdbc:mysql://localhost:3306/logic-game";
	public static final String USER = "root";
	public static final String PASSWORD = "root";

	@Getter private Connection connection;

	public MySQL() {
		setup();
	}

	@Override
	public void setup() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = java.sql.DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			LOGGER.log(Level.WARNING, "Error while setting up MySQL database: ", e);
			System.exit(1);
		}
	}
}
