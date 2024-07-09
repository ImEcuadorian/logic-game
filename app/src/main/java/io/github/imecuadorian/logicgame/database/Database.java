package io.github.imecuadorian.logicgame.database;

import java.sql.Connection;

public interface Database {

	void setup();

	Connection getConnection();

}
