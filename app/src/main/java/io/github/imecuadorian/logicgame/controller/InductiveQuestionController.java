package io.github.imecuadorian.logicgame.controller;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.model.InductiveQuestion;
import io.github.imecuadorian.logicgame.services.InductiveQuestionService;
import lombok.AllArgsConstructor;
import java.util.List;
@AllArgsConstructor
public class InductiveQuestionController {

	private final InductiveQuestionService inductiveQuestionService;

	public List<InductiveQuestion> getAll() {
		return inductiveQuestionService.getAll();
	}

	public InductiveQuestion get(Integer id) {
		return inductiveQuestionService.get(id);
	}

	public InductiveQuestion save(InductiveQuestion entity) {
		return inductiveQuestionService.save(entity);
	}

	public void delete(Integer id) {
		inductiveQuestionService.delete(id);
	}

	public int getSize() {
		return inductiveQuestionService.getAll().size();
	}

}
