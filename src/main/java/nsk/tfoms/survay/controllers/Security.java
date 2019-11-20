package nsk.tfoms.survay.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Security {

	private final String ERROR_MESSAGE = "Неправильно введен логин или пароль.";
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	  public String home()
	  {
		  return "redirect:general";
	  }
	  	
	  	@RequestMapping(value = "/login", method = RequestMethod.GET)
	  	public String login() {
	  		return "login";
	  	}

	  	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	  	public String loginerror(ModelMap model) {
	  		model.addAttribute("error", ERROR_MESSAGE);
	  		return "login";
	  	}

	  	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	  	public String logout() {
	  		return "login";
	  	}
}
