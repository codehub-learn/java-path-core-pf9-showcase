package gr.codelearn;

import gr.codelearn.repository.DataSource;
import gr.codelearn.repository.DataSourceConnectionPooling;
import lombok.extern.slf4j.Slf4j;
import org.h2.store.Data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class Main {
	public static void main(String[] args) throws SQLException {
		// H2
		//DataSource.getConnection();
		String createUniversity =
				"CREATE TABLE UNIVERSITY (id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT, name VARCHAR2(100) NOT NULL)";
		try(Connection connection = DataSourceConnectionPooling.getConnection()){
			Statement statement = connection.createStatement();
			log.info("{}", statement.execute(createUniversity));
		}

	}
}
