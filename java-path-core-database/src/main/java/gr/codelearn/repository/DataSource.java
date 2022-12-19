package gr.codelearn.repository;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Slf4j
public class DataSource {
	private static final String DB_CONNECTION_URL_FILE_MODE = "jdbc:h2:~/sample";
	private static final String DB_CONNECTION_URL_MEMORY_MODE = "jdbc:h2:mem:sample";
	private static final String DB_USERNAME = "sa";
	private static final String DB_PASSWORD = "";

	private static Connection connection;

	public static Connection getConnection(){
		if(connection == null) {
			try (Connection connection = DriverManager.getConnection(DB_CONNECTION_URL_MEMORY_MODE, DB_USERNAME,
																	 DB_PASSWORD)) {
				//Class.forName("org.h2.Driver"); prior java 6 (?)
				log.info("{}", connection.getMetaData().getDatabaseProductVersion());
				return connection;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
