package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;

import java.util.List;

public interface DeductiveQuestionService {

	List<DeductiveQuestion> getAll();

	DeductiveQuestion get(final Integer id);

	DeductiveQuestion save(DeductiveQuestion entity);

	void delete(final Integer id);

}
