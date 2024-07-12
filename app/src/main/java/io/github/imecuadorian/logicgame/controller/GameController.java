package io.github.imecuadorian.logicgame.controller;

import io.github.imecuadorian.logicgame.model.Game;
import io.github.imecuadorian.logicgame.services.GameService;

import java.util.List;

public class GameController {

	private final GameService gameService;

	public Game save(Game game) { return gameService.save(game); }

	public List<Game> getAllGames() { return gameService.getAll(); }

	public Game get(Integer id) { return gameService.get(id); }

	public void delete(Integer id) { gameService.delete(id); }

	public int getsize() { return getAllGames().size(); }
}
