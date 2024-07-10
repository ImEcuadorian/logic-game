package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.model.Model;

import java.util.List;

public interface Repository<T extends Model, K> {

	List<T> getAll();

	T get(K id);

	T save(T entity);

	void delete(K id);
}
