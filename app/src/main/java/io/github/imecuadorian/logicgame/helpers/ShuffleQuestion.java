package io.github.imecuadorian.logicgame.helpers;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.model.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleQuestion {

	public static List<? extends Model> shuffleQuestions(List<? extends Model> questions) {
		Collections.shuffle(questions);
		return questions;
	}

	public static String shuffleOptions(String options) {
		String[] optionsArray = options.split("-");
		List<String> optionsList = new ArrayList<>(List.of(optionsArray));
		Collections.shuffle(optionsList);
		return String.join(",", optionsList);
	}

}
