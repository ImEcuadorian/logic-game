package io.github.imecuadorian.logicgame.services;

import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.repositories.Repository;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class DeductiveQuestionServiceImpl implements DeductiveQuestionService {

	private final Repository<DeductiveQuestion, Integer> deductiveQuestionRepository;

	@Override
	public List<DeductiveQuestion> getAll() {
		return deductiveQuestionRepository.getAll();
	}

	@Override
	public DeductiveQuestion get(Integer id) {
		return deductiveQuestionRepository.get(id);
	}

	@Override
	public DeductiveQuestion save(DeductiveQuestion entity) {
		return deductiveQuestionRepository.save(entity);
	}

	@Override
	public void delete(Integer id) {
		deductiveQuestionRepository.delete(id);
	}
}
