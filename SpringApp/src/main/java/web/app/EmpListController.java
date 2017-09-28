package web.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class EmpListController {
 
	/**
	 * Main page of employees
	 * @param model
	 * @return "empList.jsp"
	 */
    @RequestMapping(method = RequestMethod.GET)
    public String empPage(ModelMap model) {
    	List<String> listOfEmp = new ArrayList<String>(Arrays.asList("Peter","Peter2","Maria"));
        model.addAttribute("lists", listOfEmp);
        return "empList";
    }
 
    /**
     * Redirect on employee click
     * @param model
     * @return "hello.jsp"
     */
   @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String subPage(ModelMap model) {
        return "hello";
    }
 
}