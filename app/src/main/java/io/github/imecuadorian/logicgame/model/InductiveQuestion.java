package io.github.imecuadorian.logicgame.model;

import lombok.Data;

import java.util.List;

@Data
public class InductiveQuestion implements Model {

	private int id;
	private String firstObservation;
	private String secondObservation;
	private String thirdObservation;
	private String conclusion;
	private String options;
	private String correctOption;

}
