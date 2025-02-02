package io.github.imecuadorian.logicgame.repositories;

import io.github.imecuadorian.logicgame.database.Database;
import io.github.imecuadorian.logicgame.model.DeductiveQuestion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeductiveQuestionRepositoryImpl
	implements Repository<DeductiveQuestion, Integer> {

	private final String TABLE_NAME = "deductive_questions";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME +
	                                  " (first_premise, second_premise, conclusion, options, " +
	                                  "correct_option, explanation) VALUES (?, ?, ?, ?, ?, ?)";

	private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public DeductiveQuestionRepositoryImpl(final Database database) { this.database = database; }

	@Override
	public List<DeductiveQuestion> getAll() {
		List<DeductiveQuestion> deductiveQuestions = new ArrayList<>();
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_ALL_QUERY);
			while (resultSet.next()) {
				DeductiveQuestion deductiveQuestion = getDeductiveQuestion();
				deductiveQuestions.add(deductiveQuestion);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return deductiveQuestions;
	}

	private DeductiveQuestion getDeductiveQuestion() throws SQLException {
		DeductiveQuestion deductiveQuestion = new DeductiveQuestion();
		deductiveQuestion.setId(resultSet.getInt("id"));
		deductiveQuestion.setFirstPremise(resultSet.getString("first_premise"));
		deductiveQuestion.setSecondPremise(resultSet.getString("second_premise"));
		deductiveQuestion.setConclusion(resultSet.getString("conclusion"));
		deductiveQuestion.setOptions(resultSet.getString("options"));
		deductiveQuestion.setCorrectOption(resultSet.getString("correct_option"));
		deductiveQuestion.setExplanation(resultSet.getString("explanation"));
		return deductiveQuestion;
	}

	@Override
	public DeductiveQuestion get(final Integer id) {
		try {
			statement = database.getConnection()
				            .createStatement();
			resultSet = statement.executeQuery(GET_QUERY);
			if (resultSet.next()) {
				return getDeductiveQuestion();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}

	@Override
	public DeductiveQuestion save(final DeductiveQuestion entity) {
		try {
			preparedStatement = database.getConnection()
				                 .prepareStatement(SAVE_QUERY);
			preparedStatement.setString(1, entity.getFirstPremise());
			preparedStatement.setString(2, entity.getSecondPremise());
			preparedStatement.setString(3, entity.getConclusion());
			preparedStatement.setString(4, entity.getOptions());
			preparedStatement.setString(5, entity.getCorrectOption());
			preparedStatement.setString(6, entity.getExplanation());
			preparedStatement.executeUpdate();
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
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
