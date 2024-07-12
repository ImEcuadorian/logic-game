package io.github.imecuadorian.logicgame.controller;

@AllArgConstructor
public class ScoreController {

	private final ScoreService scoreService;

	public Score save(Score score){return scoreService.save(entity)}

	public List<Score> getAllScores(){return scoreService.getAll();}


}
