package app.server.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import app.server.model.Employee;

public class PostgresDAO {
	
	private JdbcTemplate jdbc;
	
	public PostgresDAO(DataSource dataSource) {
		jdbc = new JdbcTemplate(dataSource);
	}
	
	
	
	
	
	
	
	public List<Employee> getEmployeeList() {
		
		List<Employee> employeeList= jdbc.query("select * from employee",
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return employeeList;
	}


	
	
}
