package io.github.imecuadorian.logicgame.model;

import lombok.Getter;

@Getter
public class Time implements Runnable {

	private static final int TIME = 15;

	@Override
	public void run() {
		update();
	}

	public void update() {
		double time = TIME;
		time -= 0.1;

		while (time > 0) {
			time -= 0.1;
			if (time == 0) {
				break;
			}
		}
	}

}
