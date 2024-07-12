package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Game;
import io.github.imecuadorian.logicgame.repositories.GameRepositoryImpl;

import java.util.List;

public class GameServiceImpl implements GameService{
			private final GameRepositoryImpl gameRepositoryImpl;

		@Override
		public List<Game> getAll() {
				return gameRepositoryImpl.getAll();
		}

		@Override
		public Game get(Integer id) {
				return gameRepositoryImpl.get(id);
		}

		@Override
		public Game save(Game entity) {
				return gameRepositoryImpl.save(entity);
		}

		@Override
		public void delete(Integer id) {
				gameRepositoryImpl.delete(id);
		}

}
