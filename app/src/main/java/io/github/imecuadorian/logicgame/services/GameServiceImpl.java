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

		@Override
		public Game getGameByTypeGame(String typeGame) {
				return gameRepositoryImpl.getGameByTypeGame(typeGame).orElse(new Game());
		}

		@Override
		public void updateLevelByTypeGame(String typeGame, int level) {
				gameRepositoryImpl.updateLevelByTypeGame(typeGame, level);
		}

		@Override
		public void updateLevel(String typeGame, int level) {
				gameRepositoryImpl.updateLevel(typeGame, level);
		}

		@Override
		public void updateTypeGame(String typeGame) {
				gameRepositoryImpl.updateTypeGame(typeGame);
		}

		@Override
		public void updateScoreId(String typeGame, int scoreId) {
				gameRepositoryImpl.updateScoreId(typeGame, scoreId);
		}

		@Override
		public void updateScoreIdByTypeGame(String typeGame, int scoreId) {
				gameRepositoryImpl.updateScoreIdByTypeGame(typeGame, scoreId);
		}

		@Override
		public List<Game> getTopGames() {
				return gameRepositoryImpl.getTopGames();
		}
}
