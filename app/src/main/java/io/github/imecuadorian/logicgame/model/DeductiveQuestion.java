package io.github.imecuadorian.logicgame.model;

import lombok.Data;

@Data
public class DeductiveQuestion implements Model {

	private int id;
	private String firstPremise;
	private String secondPremise;
	private String conclusion;
	private String options;
	private String correctOption;
	private String explanation;

}
