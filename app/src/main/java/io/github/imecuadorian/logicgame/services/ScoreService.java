package io.github.imecuadorian.logicgame.services;

public interface ScoreService {

	List<Score> getAll();

	Score get(Integer id);

	Score save(Score entity);

	void delete(Integer id);

	Score getScoreByPlayerId(final int player Id);

}
