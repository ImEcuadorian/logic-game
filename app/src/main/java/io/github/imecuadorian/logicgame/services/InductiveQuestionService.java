package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.InductiveQuestion;

import java.util.List;

public interface InductiveQuestionService {

	List<InductiveQuestion> getAll();

	InductiveQuestion get(final Integer id);

	InductiveQuestion save(InductiveQuestion entity);

	void delete(final Integer id);

}
