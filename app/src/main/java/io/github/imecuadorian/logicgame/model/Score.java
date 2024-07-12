package io.github.imecuadorian.logicgame.model;

import lombok.Data;

@Data
public class Score implements Model {

	private int id;

	private int score;

	private int level;

	private int typeGameId;

	private int playerId;
}
