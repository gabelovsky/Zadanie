package app.web;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.server.database.PostgresDAO;
import app.server.model.Employee;

@Controller
@ComponentScan(basePackages = "app.server.database")
public class EmpListController {

	@Autowired
	PostgresDAO dao;

	List<Employee> listOfEmp;

	/**
	 * Main page of employees, connects to database to load data
	 * 
	 * @param model
	 * @return "empList.jsp"
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String empPage(ModelMap model) {
		listOfEmp = dao.getEmployeeList();
		model.addAttribute("list", listOfEmp);
		return "empList";
	}

	/**
	 * Popup on employee click, contains details about the employee
	 * 
	 * @param model
	 * @return "popup.jsp"
	 * @throws UnsupportedEncodingException
	 */
	@RequestMapping(value = "/popup", method = RequestMethod.GET)
	public String popupWindow(ModelMap model, @RequestParam("empID") String empID) throws UnsupportedEncodingException {
		Employee emp = dao.getEmployeeDetails(Long.parseLong(empID));
		if (emp.getPhoto() != null) {
			String base64Photo = new String(Base64.getEncoder().encode(emp.getPhoto()), "UTF-8");
			model.addAttribute("photo", base64Photo);
		}
		return "popup";
	}

}