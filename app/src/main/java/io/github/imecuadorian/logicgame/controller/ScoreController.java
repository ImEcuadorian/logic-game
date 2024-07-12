package io.github.imecuadorian.logicgame.controller;

import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.services.ScoreService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ScoreController {

	private final ScoreService scoreService;

	public Score save(Score score) { return scoreService.save(score); }

	public List<Score> getAllScores() { return scoreService.getAll(); }
}
