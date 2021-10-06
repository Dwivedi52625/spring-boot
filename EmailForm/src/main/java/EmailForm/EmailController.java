package EmailForm;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import EmailFormnew.User;
import EmailFormnew.UserLogin;
@Controller
public class EmailController {
    

	
	@RequestMapping("/Email")
	public String showForm() {
		
		return "Email.jsp";
	}
	@RequestMapping(path="/processform", method=  RequestMethod.POST)
	public String handleform(@Valid @ModelAttribute("user") User user,BindingResult result) {
		System.out.println(result.hasErrors());
		System.out.println(user.getEmail() + " " + user.getPassword() + " " + user.getUsername());
		if(!result.hasErrors())
			return "Login.jsp";
		else
			return "error.jsp";
	}
	@RequestMapping(path="/loginprocess", method=RequestMethod.POST)
	public String loginform(@Valid @ModelAttribute("ul") UserLogin ul,BindingResult result) {
		System.out.println(result.hasErrors());
		System.out.println(ul.getEmail() + " " + ul.getPassword());
		if(!result.hasErrors())
			return "success.jsp";
		else
			return "error.jsp";
	}
}

/*
@RequestMapping(path="/processform", method=RequestMethod.POST)
public String handleform(@RequestParam("email") String userEmail, 
		                 @RequestParam("username") String userName, 
		                 @RequestParam("password") String Password,Model model) {
			
	System.out.println("user email "+userEmail);
	System.out.println("user name "+userName);
	System.out.println("user password "+Password);
	
	model.addAttribute("name",userName);
	model.addAttribute("email",userEmail);
	model.addAttribute("password",Password);
	
	
	return "success.jsp";
}
*/