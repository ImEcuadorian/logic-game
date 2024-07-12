package io.github.imecuadorian.logicgame.services;
@AllArgsConstructor
public class ScoreServiceImpl {

	private final ScoreServiceImpl scoreServiceImpl;

	public List<Score> getAll(){return scoreServiceImpl.getAll();}

	public Score get(Integer id){return scoreServiceImpl.get(id);}

	public Score save(Score entity){return scoreServiceImpl.save(entity);}

	public void delete(Integer id){scoreServiceImpl.delete(id);}

	public Score getScoreByPlayerID(final int playerId){
		return scoreServiceImpl.getScoreByPlayerID(playerId);
	}


}
