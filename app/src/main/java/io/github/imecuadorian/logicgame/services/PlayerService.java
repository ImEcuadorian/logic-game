package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Player;

import java.util.List;

public interface PlayerService {

	List<Player> getAll();

	Player get(final Integer id);

	Player save(Player entity);

	void delete(final Integer id);

	Player getPlayerByUsername(String username);

	Player getPlayerByPointsByTypeGame(String username, String typeGame);
	Player getPlayerAllPoints(String username);

	void updateScoreByTypeGame(String username, String typeGame, int points);

	void updateScore(String username, int points);

	void updateLevelByTypeGame(String username, String typeGame, int level);

	void updateLevel(String username, int level);

	void updateTypeGame(String username, String typeGame);

	void updateScoreId(String username, int scoreId);

	void updateScoreIdByTypeGame(String username, String typeGame, int scoreId);

	List<Player> getTopPlayersByTypeGame(String typeGame);

	List<Player> getTopPlayers();
}

