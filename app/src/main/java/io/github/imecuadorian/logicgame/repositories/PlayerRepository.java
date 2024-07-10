package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlayerRepository implements Repository<Player, Integer> {

	private final String TABLE_NAME = "players";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME +
	                                  " (username) VALUES (?)";

	private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public PlayerRepository(final Database database) {
		this.database = database;
	}

	@Override
	public List<Player> getAll() {
		List<Player> players = new ArrayList<>();
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_ALL_QUERY);
			while (resultSet.next()) {
				Player player = getPlayer();
				players.add(player);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return players;
	}

	@Override
	public Player get(final Integer id) {
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_QUERY);
			if (resultSet.next()) {
				return getPlayer();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	private Player getPlayer() throws SQLException {
		Player player = new Player();
		player.setId(resultSet.getInt("id"));
		player.setUsername(resultSet.getString("username"));
		return player;
	}

	@Override
	public Player save(final Player entity) {
		try {
			preparedStatement = database.getConnection()
				                 .prepareStatement(SAVE_QUERY, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, entity.getUsername());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return entity;
	}

	@Override
	public void delete(final Integer id) {
		try {
			preparedStatement = database.getConnection()
				                 .prepareStatement(DELETE_QUERY);
			preparedStatement.setInt(1, id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Optional<Player> getPlayerByUsername(String username) {
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery("SELECT * FROM " + TABLE_NAME + " WHERE username = '" + username + "'");
			if (resultSet.next()) {
				return Optional.of(getPlayer());
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return Optional.empty();
	}
}
