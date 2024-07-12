package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Game;
import io.github.imecuadorian.logicgame.model.Player;

import java.util.List;

public interface GameService {
	List<Game> getAll();
	Game get(final Integer id);
	Game save(Game entity);
	void delete(final Integer id);

}
