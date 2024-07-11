package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.InductiveQuestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InductiveQuestionRepositoryImpl
	implements Repository<InductiveQuestion, Integer> {

	private final String TABLE_NAME = "inductive_questions";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME + " (first_observation, " +
	                                  "second_observation,thrid_observation, conclusion , options, " +
	                                  " correct_option) VALUES(?, ?, ?, ?, ?, ?)";

	private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public InductiveQuestionRepositoryImpl(final Database database) {
		this.database = database;
	}

	@Override
	public List<InductiveQuestion> getAll() {
		List<InductiveQuestion> inductiveQuestions = new ArrayList<>();
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_ALL_QUERY);
			while (resultSet.next()) {
				InductiveQuestion inductiveQuestion = getInductiveQuestion();
				inductiveQuestions.add(inductiveQuestion);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		return inductiveQuestions;
	}

	private InductiveQuestion getInductiveQuestion() throws SQLException {
		InductiveQuestion inductiveQuestion = new InductiveQuestion();
		inductiveQuestion.setId(resultSet.getInt("id"));
		inductiveQuestion.setFirstObservation(resultSet.getString("first_observation"));
		inductiveQuestion.setSecondObservation(resultSet.getString("second_observation"));
		inductiveQuestion.setThirdObservation(resultSet.getString("third_observation"));
		inductiveQuestion.setConclusion(resultSet.getString("conclusion"));
		inductiveQuestion.setOptions(resultSet.getString("options"));
		inductiveQuestion.setCorrectOption(resultSet.getString("correct_option"));

		return inductiveQuestion;
	}

	@Override
	public InductiveQuestion get(final Integer id) {
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_QUERY);
			if (resultSet.next()) {
				return getInductiveQuestion();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public InductiveQuestion save(final InductiveQuestion entity) {
		try {
			preparedStatement = database.getConnection()
				                    .prepareStatement(SAVE_QUERY);
			preparedStatement.setString(1, entity.getFirstObservation());
			preparedStatement.setString(2, entity.getSecondObservation());
			preparedStatement.setString(3, entity.getThirdObservation());
			preparedStatement.setString(4, entity.getConclusion());
			preparedStatement.setString(5, entity.getOptions());
			preparedStatement.setString(6, entity.getCorrectOption());
			return entity;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void delete(final Integer id) {
		try {
			preparedStatement = database.getConnection()
				                    .prepareStatement(DELETE_QUERY);
			preparedStatement.setInt(1, id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
