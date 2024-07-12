package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.Game;
import io.github.imecuadorian.logicgame.model.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GameRepositoryImpl
	implements Repository<Game, Integer> {//porque me pide constructor?

	private final String TABLE_NAME = "games";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY =
		"INSERT INTO " + TABLE_NAME + " (typeGame) VALUES(?,?)";

	private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public GameRepositoryImpl(final Database database) { this.database = database; }

	@Override
	public List<Game> getAll() {
		List<Game> games = new ArrayList<>();
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_ALL_QUERY);
			while (resultSet.next()) {
				Game game = getGame();
				games.add(game);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return games;
	}

	private Game getGame() throws SQLException {
		Game game = new Game();
		game.setId(resultSet.getInt("id"));
		game.setTypeGame(resultSet.getString("typeGame"));
		return game;
	}

	@Override
	public Game get(final Integer id) {
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_QUERY);
			if (resultSet.next()) {
				return getGame();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;//porque null?  manejo direccion dememoria?
	}

	@Override
	public Player save(final Game game) {
		try {
			preparedStatement = database.getConnection()
				                    .prepareStatement(SAVE_QUERY);
			preparedStatement.setString(1, game.getTypeGame());//porque parametro 1?
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return game;
	}

	@Override
	public void delete(final Integer id) {
		try {
			preparedStatement = database.getConnection()
				                    .prepareStatement(DELETE_QUERY);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


};
