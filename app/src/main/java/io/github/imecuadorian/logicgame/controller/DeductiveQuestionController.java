package io.github.imecuadorian.logicgame.controller;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DeductiveQuestionController {

	private final DeductiveQuestionService deductiveQuestionService;

	public List<DeductiveQuestion> getAll() {
		return deductiveQuestionService.getAll();
	}

	public DeductiveQuestion get(Integer id) {
		return deductiveQuestionService.get(id);
	}

	public DeductiveQuestion save(DeductiveQuestion entity) {
		return deductiveQuestionService.save(entity);
	}

	public void delete(Integer id) {
		deductiveQuestionService.delete(id);
	}

}
