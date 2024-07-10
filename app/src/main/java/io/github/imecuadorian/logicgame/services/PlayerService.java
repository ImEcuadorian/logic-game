package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.Player;

import java.util.List;

public interface PlayerService {

	List<Player> getAll();

	Player get(final Integer id);

	Player save(Player entity);

	void delete(final Integer id);

	Player getPlayerByUsername(String username);
}

