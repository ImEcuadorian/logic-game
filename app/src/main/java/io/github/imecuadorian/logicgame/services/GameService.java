package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Game;
import io.github.imecuadorian.logicgame.model.Player;

import java.util.List;

public interface GameService {
	List<Game> getAll();
	Game get(final Integer id);
	Game save(Game entity);
	void delete(final Integer id);
	Game getGameByTypeGame(String typeGame);
	void updateLevelByTypeGame(String typeGame, int level);
	void updateLevel(String typeGame, int level);
	void updateTypeGame(String typeGame);
	void updateScoreId(String typeGame, int scoreId);
	void updateScoreIdByTypeGame(String typeGame, int scoreId);
	List<Game> getTopGames();


}
