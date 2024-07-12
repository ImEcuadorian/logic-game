package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Game;
import io.github.imecuadorian.logicgame.repositories.Repository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GameServiceImpl
	implements GameService {

	private final Repository<Game, Integer> gameRepository;

	@Override
	public List<Game> getAll() {
		return gameRepository.getAll();
	}

	@Override
	public Game get(Integer id) {
		return gameRepository.get(id);
	}

	@Override
	public Game save(Game entity) {
		return gameRepository.save(entity);
	}

	@Override
	public void delete(Integer id) {
		gameRepository.delete(id);
	}
}
