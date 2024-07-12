package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.repositories.PlayerRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

	private final PlayerRepository playerRepository;

	@Override
	public List<Player> getAll() {
		return playerRepository.getAll();
	}

	@Override
	public Player get(Integer id) {
		return playerRepository.get(id);
	}

	@Override
	public Player save(Player entity) {
		return playerRepository.save(entity);
	}

	@Override
	public void delete(Integer id) {
		playerRepository.delete(id);
	}

	@Override
	public Player getPlayerByUsername(final String username) {
		return playerRepository.getPlayerByUsername(username).orElse(new Player());
	}

	@Override
	public Player getPlayerByPointsByTypeGame(final String username, final String typeGame) {
		return playerRepository.getPlayerByPointsByTypeGame(username, typeGame).orElse(new Player());
	}

	@Override
	public Player getPlayerAllPoints(final String username) {
		return playerRepository.getPlayerAllPoints(username).orElse(new Player());
	}

	@Override
	public void updateScoreByTypeGame(
		final String username,
		final String typeGame,
		final int points
	) {
		playerRepository.updateScoreByTypeGame(username, typeGame, points);
	}

	@Override
	public void updateScore(final String username, final int points) {
		playerRepository.updateScore(username, points);
	}

	@Override
	public void updateLevelByTypeGame(final String username, final String typeGame, final int level) {
		playerRepository.updateLevelByTypeGame(username, typeGame, level);
	}

	@Override
	public void updateLevel(final String username, final int level) {
		playerRepository.updateLevel(username, level);
	}

	@Override
	public void updateTypeGame(final String username, final String typeGame) {
		playerRepository.updateTypeGame(username, typeGame);
	}

	@Override
	public void updateScoreId(final String username, final int scoreId) {
		playerRepository.updateScoreId(username, scoreId);
	}

	@Override
	public void updateScoreIdByTypeGame(
		final String username,
		final String typeGame,
		final int scoreId
	) {
		playerRepository.updateScoreIdByTypeGame(username, typeGame, scoreId);
	}

	@Override
	public List<Player> getTopPlayersByTypeGame(final String typeGame) {
		return playerRepository.getTopPlayersByTypeGame(typeGame);
	}

	@Override
	public List<Player> getTopPlayers() {
		return playerRepository.getTopPlayers();
	}
}
