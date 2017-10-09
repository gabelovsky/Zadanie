package app.web;

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

	/**
	 * Main page of employees, connects to database to load data
	 * 
	 * @param model
	 * @return "empList.jsp"
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String empPage(ModelMap model) {
		List<Employee> listOfEmp = dao.getEmployeeList();
		model.addAttribute("list", listOfEmp);
		return "empList";
	}

	/**
	 * Pop-up on employee click, ads data about the employee
	 * 
	 * @param model
	 * @return "popup.jsp"
	 */
	@RequestMapping(value = "/popup", method = RequestMethod.GET)
	public String popupWindow(ModelMap model, @RequestParam("empID") String empID){
		Employee emp = dao.getEmployeeDetails(Long.parseLong(empID));
		model.addAttribute("emp",emp);
		return "popup";
	}

}