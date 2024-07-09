package io.github.imecuadorian.logicgame.repositories;

import java.util.List;

public interface DeductiveQuestionRepository<T, K> {

	List<T> getAll();
	T get(K id);

	T save(T entity);

	void delete(K id);
}
