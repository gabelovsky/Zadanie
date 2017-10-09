package app.server.database;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import app.server.model.Employee;

public class PostgresDAO {

	private JdbcTemplate jdbc;

	public PostgresDAO(DataSource dataSource) {
		jdbc = new JdbcTemplate(dataSource);
	}

	/**
	 * Get the list of employess
	 * 
	 * @return list of id, first and last names
	 */
	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = jdbc.query("select empid,firstname,lastname from employee",
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return employeeList;
		// to return a map
		// return employeeList.stream().collect( Collectors.toMap(Employee::getEmpID,
		// Employee::getEmployee));
	}

	/**
	 * Gets the employee from the database and encodes the image to displayable
	 * format
	 * 
	 * @param empID
	 *            - the id of the employee
	 * @return Employee object with data
	 */
	public Employee getEmployeeDetails(Long empID) {

		/*
		 * File imgPath = new File("C:/asd/pic3.png"); BufferedImage bufferedImage;
		 * byte[] imageInByte=null; try { bufferedImage = ImageIO.read(imgPath);
		 * ByteArrayOutputStream baos = new ByteArrayOutputStream(); ImageIO.write(
		 * bufferedImage, "png", baos ); baos.flush(); imageInByte= baos.toByteArray();
		 * baos.close(); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * jdbc.update("update employee set photo=? where empid=3",imageInByte);
		 */

		Employee emp = (Employee) jdbc.queryForObject("select * from employee where empID=?", new Object[] { empID },
				new BeanPropertyRowMapper<Employee>(Employee.class));
		if (emp.getPhoto() != null) {
			try {
				emp.setEncodedPhoto(new String(Base64.getEncoder().encode(emp.getPhoto()), "UTF-8"));
			} catch (UnsupportedEncodingException e) {
				System.out.println("Failed to encode photo into base 64");
			}
		}else {
			emp.setEncodedPhoto("No photo found");
		}
		return emp;
	}
}
