package io.github.imecuadorian.logicgame.model;

import lombok.Data;

@Data
public class Player implements Model {

	private static final byte LIFE = 3;
	private int id;
	private String username;
	private int scoreId;

}
