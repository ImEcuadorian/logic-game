package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.Score;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class ScoreRepositoryImpl
	implements Repository<Score, Integer> {

	private final String TABLE_NAME = "score";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME + " VALUES (?, ?)";//casteo o
	// hago algo??
	private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public ScoreRepositoryImpl(final Database database) {
		this.database = database;
	}

	@Override
	public List<Score> getAll() {
		return List.of();
	}

	@Override
	public Score get(final Integer id) {
		return null;
	}

	@Override
	public Score save(final Score entity) {
		return null;
	}

	@Override
	public void delete(final Integer id) {

	}

	public Score getScoreByPlayerID(final int playerId) {
		return null;
	}
}
