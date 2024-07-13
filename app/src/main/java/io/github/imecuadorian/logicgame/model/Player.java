package io.github.imecuadorian.logicgame.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Player implements Model {

	private byte LIFE = 3;
	private int id;
	private String username;
	private int scoreId;
	public Player(final String username) {
		this.username = username;
	}

	public Player() {
	}

	public byte reduceLife() {
		return --LIFE;
	}

}
