package io.github.imecuadorian.logicgame.model;

import lombok.Data;

import java.util.List;

@Data
public class InductiveQuestion {

	private int id;
	private String firstObservation;
	private String secondObservation;
	private String thirdObservation;
	private String conclusion;
	private List<String> options;
	private String correctOption;

}
