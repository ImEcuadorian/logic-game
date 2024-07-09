package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.repositories.DeductiveQuestionRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DeductiveQuestionServiceImpl implements DeductiveQuestionService {

	private final DeductiveQuestionRepository deductiveQuestionRepository;

	@Override
	public List<DeductiveQuestion> getAll() {
		return deductiveQuestionRepository.getAll();
	}

	@Override
	public DeductiveQuestion get(Integer id) {
		return (DeductiveQuestion) deductiveQuestionRepository.get(id);
	}

	@Override
	public DeductiveQuestion save(DeductiveQuestion entity) {
		return (DeductiveQuestion) deductiveQuestionRepository.save(entity);
	}

	@Override
	public void delete(Integer id) {
		deductiveQuestionRepository.delete(id);
	}
}
