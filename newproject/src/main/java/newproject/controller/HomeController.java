package newproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    
	@RequestMapping(value="/helloworld", method =RequestMethod.GET)
	public String helloworld() {
		System.out.println("This is home url");
		return "sample.jsp";
	}
}
