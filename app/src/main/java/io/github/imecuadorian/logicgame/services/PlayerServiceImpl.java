package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.repositories.PlayerRepository;
import io.github.imecuadorian.logicgame.repositories.Repository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {

	private final Repository<Player, Integer> playerRepository;

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
		return ((PlayerRepository) playerRepository).getPlayerByUsername(username).orElse(new Player());
	}
}
