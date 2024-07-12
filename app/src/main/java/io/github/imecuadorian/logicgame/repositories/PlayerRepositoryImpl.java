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

public class PlayerRepositoryImpl
        implements Repository<Player, Integer> {

    private final String TABLE_NAME = "players";

    private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

    private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

    private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME + " (username) VALUES (?)";

    private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

    private final Database database;

    private ResultSet resultSet;

    private Statement statement;

    private PreparedStatement preparedStatement;

    public PlayerRepositoryImpl(final Database database) {
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
            resultSet = statement.executeQuery(
                    "SELECT * FROM " + TABLE_NAME + " WHERE username = '" + username + "'");
            if (resultSet.next()) {
                return Optional.of(getPlayer());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }


    public Optional<Player> getPlayerByPointsByTypeGame(String username, String typeGame) {
        try {
            String query =
                    "SELECT id, username, score_id FROM " + TABLE_NAME + " INNER JOIN score ON score" +
                            ".id = score.player_id INNER JOIN game ON score.type_game_id = game.id WHERE " +
                            "username = '" +
                            username + "' AND type_game = '" + typeGame + "'";

            statement = database.getConnection()
                    .createStatement();
            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return Optional.of(getPlayer());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    public Optional<Player> getPlayerAllPoints(String username) {
        try {
            String query =
                    "SELECT id, username, score_id FROM " + TABLE_NAME + " INNER JOIN score ON score" +
                            ".id = score.player_id WHERE username = '" + username + "'";

            statement = database.getConnection()
                    .createStatement();
            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return Optional.of(getPlayer());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    public void updateScoreByTypeGame(String username, String typeGame, int score) {
        try {
            String query =
                    "UPDATE score SET score = " + score + " WHERE player_id = (SELECT id FROM " +
                            TABLE_NAME + " WHERE username = '" + username + "') AND type_game_id = (SELECT " +
                            "id FROM game WHERE type_game = '" + typeGame + "')";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateScore(String username, int score) {
        try {
            String query =
                    "UPDATE score SET score = " + score + " WHERE player_id = (SELECT id FROM " +
                            TABLE_NAME + " WHERE username = '" + username + "')";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateLevelByTypeGame(String username, String typeGame, int level) {
        try {
            String query =
                    "UPDATE score SET level = " + level + " WHERE player_id = (SELECT id FROM " +
                            TABLE_NAME + " WHERE username = '" + username + "') AND type_game_id = (SELECT " +
                            "id FROM game WHERE type_game = '" + typeGame + "')";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateLevel(String username, int level) {
        try {
            String query =
                    "UPDATE score SET level = " + level + " WHERE player_id = (SELECT id FROM " +
                            TABLE_NAME + " WHERE username = '" + username + "')";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateTypeGame(String username, String typeGame) {
        try {
            String query =
                    "UPDATE score SET type_game_id = (SELECT id FROM game WHERE type_game = '" +
                            typeGame + "') WHERE player_id = (SELECT id FROM " + TABLE_NAME + " WHERE username = '" + username + "')";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateScoreId(String username, int scoreId) {
        try {
            String query =
                    "UPDATE " + TABLE_NAME + " SET score_id = " + scoreId + " WHERE username = '" +
                            username + "'";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateScoreIdByTypeGame(String username, String typeGame, int scoreId) {
        try {
            String query =
                    "UPDATE " + TABLE_NAME + " SET score_id = " + scoreId + " WHERE username = '" +
                            username + "' AND score_id = (SELECT id FROM score WHERE player_id = (SELECT id " +
                            "FROM " + TABLE_NAME + " WHERE username = '" + username + "') AND type_game_id = " +
                            "(SELECT id FROM game WHERE type_game = '" + typeGame + "'))";

            statement = database.getConnection()
                    .createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Player> getTopPlayersByTypeGame(String typeGame) {
        List<Player> players = new ArrayList<>();
        try {
            String query =
                    "SELECT username, score FROM " + TABLE_NAME + " INNER JOIN score ON score" +
                            ".id = score.player_id INNER JOIN game ON score.type_game_id = game.id WHERE " +
                            "type_game = '" + typeGame + "' ORDER BY score DESC LIMIT 10";

            statement = database.getConnection()
                    .createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Player player = new Player();
                player.setUsername(resultSet.getString("username"));
                player.setScoreId(resultSet.getInt("score"));
                players.add(player);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return players;
    }

    public List<Player> getTopPlayers() {
        List<Player> players = new ArrayList<>();
        try {
            String query =
                    "SELECT username, score FROM " + TABLE_NAME + " INNER JOIN score ON score" +
                            ".id = score.player_id ORDER BY score DESC LIMIT 10";

            statement = database.getConnection()
                    .createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Player player = new Player();
                player.setUsername(resultSet.getString("username"));
                player.setScoreId(resultSet.getInt("score"));
                players.add(player);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return players;
    }

}
