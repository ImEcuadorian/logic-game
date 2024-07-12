package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.repositories.PlayerRepositoryImpl;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

	private final PlayerRepositoryImpl playerRepositoryImpl;

	@Override
	public List<Player> getAll() {
		return playerRepositoryImpl.getAll();
	}

	@Override
	public Player get(Integer id) {
		return playerRepositoryImpl.get(id);
	}

	@Override
	public Player save(Player entity) {
		return playerRepositoryImpl.save(entity);
	}

	@Override
	public void delete(Integer id) {
		playerRepositoryImpl.delete(id);
	}

	@Override
	public Player getPlayerByUsername(final String username) {
		return playerRepositoryImpl.getPlayerByUsername(username).orElse(new Player());
	}

	@Override
	public Player getPlayerByPointsByTypeGame(final String username, final String typeGame) {
		return playerRepositoryImpl.getPlayerByPointsByTypeGame(username, typeGame).orElse(new Player());
	}

	@Override
	public Player getPlayerAllPoints(final String username) {
		return playerRepositoryImpl.getPlayerAllPoints(username).orElse(new Player());
	}

	@Override
	public void updateScoreByTypeGame(
		final String username,
		final String typeGame,
		final int points
	) {
		playerRepositoryImpl.updateScoreByTypeGame(username, typeGame, points);
	}

	@Override
	public void updateScore(final String username, final int points) {
		playerRepositoryImpl.updateScore(username, points);
	}

	@Override
	public void updateLevelByTypeGame(final String username, final String typeGame, final int level) {
		playerRepositoryImpl.updateLevelByTypeGame(username, typeGame, level);
	}

	@Override
	public void updateLevel(final String username, final int level) {
		playerRepositoryImpl.updateLevel(username, level);
	}

	@Override
	public void updateTypeGame(final String username, final String typeGame) {
		playerRepositoryImpl.updateTypeGame(username, typeGame);
	}

	@Override
	public void updateScoreId(final String username, final int scoreId) {
		playerRepositoryImpl.updateScoreId(username, scoreId);
	}

	@Override
	public void updateScoreIdByTypeGame(
		final String username,
		final String typeGame,
		final int scoreId
	) {
		playerRepositoryImpl.updateScoreIdByTypeGame(username, typeGame, scoreId);
	}

	@Override
	public List<Player> getTopPlayersByTypeGame(final String typeGame) {
		return playerRepositoryImpl.getTopPlayersByTypeGame(typeGame);
	}

	@Override
	public List<Player> getTopPlayers() {
		return playerRepositoryImpl.getTopPlayers();
	}
}
