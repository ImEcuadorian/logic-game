package io.github.imecuadorian.logicgame.repositories;

public class ScoreRepositoryImpl {
	implements Repository<Score, Integer>

	private final String TABLE_NAME = "score";

	private final String GET_ALL_QUERY = "SELECT * FROM " + TABLE_NAME;

	private final String GET_QUERY = "SELECT * FROM " + TABLE_NAME + " WHERE id = ?";

	private final String SAVE_QUERY = "INSERT INTO " + TABLE_NAME + " VALUES (?, ?)";//casteo o
	// hago algo??
	private final String DELETE_QUERY = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";

	private final Database database;

	private ResultSet resultSet;

	private Statement statement;

	private PreparedStatement preparedStatement;

	public ScoreRepositoryImpl(final Database database) {
		this.database = database;
	}

	public List<Score> get


}
