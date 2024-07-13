package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.repositories.Repository;
import io.github.imecuadorian.logicgame.repositories.ScoreRepositoryImpl;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ScoreServiceImpl implements ScoreService {

	private final Repository<Score, Integer> scoreRepository;

	public List<Score> getAll() { return scoreRepository.getAll(); }

	public Score get(Integer id) { return scoreRepository.get(id); }

	public Score save(Score entity) { return scoreRepository.save(entity); }

	public void update(Player player, int score) {
		((ScoreRepositoryImpl) scoreRepository).update(player.getId(), score);
	}

	public void delete(Integer id) { scoreRepository.delete(id); }

	@Override
	public Score getScoreByPlayerIdAndGameType(final int playerId, final int gameType) {
		return ((ScoreRepositoryImpl) scoreRepository).getScoreByPlayerIdAndGameType(playerId, gameType);
	}
}
