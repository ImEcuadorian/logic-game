package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.InductiveQuestion;
import io.github.imecuadorian.logicgame.repositories.Repository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class InductiveQuestionServiceImpl implements InductiveQuestionService {

	private final Repository<InductiveQuestion, Integer> inductiveQuestionRepository;

	@Override
	public List<InductiveQuestion> getAll() {
		return inductiveQuestionRepository.getAll();
	}

	@Override
	public InductiveQuestion get(Integer id) {
		return inductiveQuestionRepository.get(id);
	}

	@Override
	public InductiveQuestion save(InductiveQuestion entity) {
		return inductiveQuestionRepository.save(entity);
	}

	@Override
	public void delete(Integer id) {
		inductiveQuestionRepository.delete(id);
	}
}
