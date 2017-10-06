package app.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import app.server.database.PostgresDAO;

@Controller
public class EmpListController {
	
	//@Autowired
	//PostgresDAO dao;
	
	
	/**
	 * Main page of employees
	 * 
	 * @param model
	 * @return "empList.jsp"
	 */
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String empPage(ModelMap model) {
		List<String> listOfEmp = new ArrayList<String>(Arrays.asList("Peter", "Peter2", "Maria"));
		model.addAttribute("lists", listOfEmp);
		return "empList";
	}

	/**
	 * Popup on employee click
	 * 
	 * @param model
	 * @return "popup.jsp"
	 */
	@RequestMapping(value = "/popup", method = RequestMethod.GET)
	public String popupWindow(ModelMap model, @RequestParam("empID") String empID) {
		System.out.println("ID got:" + empID);
		
		//System.out.println(dao.test);
		return "popup";
	}

}