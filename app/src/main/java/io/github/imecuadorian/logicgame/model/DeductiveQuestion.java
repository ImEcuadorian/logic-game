package io.github.imecuadorian.logicgame.model;

import lombok.Data;

import java.util.List;

@Data
public class DeductiveQuestion {

	private int id;
	private String firstPremise;
	private String secondPremise;
	private String conclusion;
	private String options;
	private String correctOption;
	private String explanation;

}
