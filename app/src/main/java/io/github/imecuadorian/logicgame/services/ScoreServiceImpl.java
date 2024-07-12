package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.repositories.ScoreRepositoryImpl;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ScoreServiceImpl {

	private final ScoreRepositoryImpl scoreRepository;

	public List<Score> getAll(){return scoreRepository.getAll();}

	public Score get(Integer id){return scoreRepository.get(id);}

	public Score save(Score entity){return scoreRepository.save(entity);}

	public void delete(Integer id){ scoreRepository.delete(id);}

	public Score getScoreByPlayerID(final int playerId){
		return scoreRepository.getScoreByPlayerID(playerId);
	}


}
