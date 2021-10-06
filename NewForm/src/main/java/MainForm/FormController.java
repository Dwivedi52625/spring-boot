package MainForm;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	 @RequestMapping(path="/process")
     public String Displayform() {
    	 return "registration.jsp";
     }
	 @RequestMapping(path="/form", method=  RequestMethod.POST)
	 public String formhandler(@Valid@ModelAttribute("ct") Customer ct) {
		 return "SuccessFull.jsp";
	 }
}
