package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Score;

import java.util.List;

public interface ScoreService {

	List<Score> getAll();

	Score get(Integer id);

	Score save(Score entity);

	void delete(Integer id);
	Score getScoreByPlayerIdAndGameType(int playerId, int gameType);
}
