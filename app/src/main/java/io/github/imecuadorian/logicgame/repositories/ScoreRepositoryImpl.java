package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.model.Score;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ScoreRepositoryImpl
	implements Repository<Score, Integer> {

	private final String TABLE_NAME = "score";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME + " (score, level, type_game_id," +
                                      " " +
	                                  "player_id" +
	                                  ") VALUES (?, ?, ?, ?)";
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
		List<Score> scores = new ArrayList<>();
		try {
			statement = database.getConnection().createStatement();
			resultSet = statement.executeQuery(GET_ALL_QUERY);
			while (resultSet.next()) {
				Score score = getScore();
				scores.add(score);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return List.of();
	}

	private Score getScore() throws SQLException {
		Score score = new Score();
		score.setId(resultSet.getInt("id"));
		score.setScore(resultSet.getInt("score"));
		score.setLevel(resultSet.getInt("level"));
		score.setPlayerId(resultSet.getInt("player_id"));
		score.setLevel(resultSet.getInt("level"));
		return score;
	}

	@Override
	public Score get(final Integer id) {
		try {
			statement = database.getConnection().createStatement();
			resultSet = statement.executeQuery(GET_QUERY);
			if(resultSet.next()) {
				return getScore();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public Score save(final Score entity) {
		try {
			preparedStatement = database.getConnection().prepareStatement(SAVE_QUERY);
			preparedStatement.setInt(1, entity.getScore());
			preparedStatement.setInt(2, entity.getLevel());
			preparedStatement.setInt(3, entity.getTypeGameId());
			preparedStatement.setInt(4, entity.getPlayerId());

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return entity;
	}

	public void update(int idPlayer, int score) {
		try {
			preparedStatement = database.getConnection().prepareStatement("UPDATE " + TABLE_NAME + " SET score = ? WHERE player_id = ?");
			preparedStatement.setInt(1, score);
			preparedStatement.setInt(2, idPlayer);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delete(final Integer id) {

		try {
			preparedStatement = database.getConnection().prepareStatement(DELETE_QUERY);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Score getScoreByPlayerID(final int playerId) {
		return null;
	}
}
