package gr.codelearn.repository;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceConnectionPooling {

	private static final String DB_CONNECTION_URL_FILE_MODE = "jdbc:h2:~/sample";
	private static final String DB_CONNECTION_URL_MEMORY_MODE = "jdbc:h2:mem:sample";
	private static final String DB_USERNAME = "sa";
	private static final String DB_PASSWORD = "";

	private static HikariDataSource hikariDataSource;

	static {
		HikariConfig hikariConfig = new HikariConfig();

		hikariConfig.setJdbcUrl(DB_CONNECTION_URL_MEMORY_MODE);
		hikariConfig.setUsername(DB_USERNAME);
		hikariConfig.setPassword(DB_PASSWORD);

		// This property controls the maximum number of milliseconds that a client (that's you) will wait for a
		// connection from the pool.
		hikariConfig.setConnectionTimeout(250);

		hikariConfig.addDataSourceProperty("maximumPoolSize", "4");
		hikariConfig.addDataSourceProperty("minimumIdle", "2");
		hikariConfig.addDataSourceProperty("idleTimeout", "10000");

		hikariDataSource = new HikariDataSource(hikariConfig);
	}

	public static Connection getConnection() throws SQLException {
		return hikariDataSource.getConnection();
	}
}
