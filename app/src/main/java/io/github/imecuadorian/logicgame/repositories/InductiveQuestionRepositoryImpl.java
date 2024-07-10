package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.InductiveQuestion;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class InductiveQuestionRepositoryImpl implements Repository<InductiveQuestion, Integer> {

	private final String TABLE_NAME = "inductive_questions";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	public InductiveQuestionRepositoryImpl(final Database database) {
		this.database = database;
	}

	@Override
	public List<InductiveQuestion> getAll() {
		return List.of();
	}

	@Override
	public InductiveQuestion get(final Integer id) {
		return null;
	}

	@Override
	public InductiveQuestion save(final InductiveQuestion entity) {
		return null;
	}

	@Override
	public void delete(final Integer id) {

	}
}
