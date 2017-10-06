package app.server.database;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PostgresDAO {
	
	private JdbcTemplate jdbcTemplate;
	public String test="asd";
	
	
	public PostgresDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	
	public void getEmployeeList() {
		
	}
	
}
