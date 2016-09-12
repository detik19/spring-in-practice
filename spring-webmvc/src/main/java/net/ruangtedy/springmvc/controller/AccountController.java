package net.ruangtedy.springmvc.controller;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.ruangtedy.springmvc.form.AccountForm;

@Controller
@RequestMapping("/users")
public class AccountController {

	private static final Logger LOG= org.slf4j.LoggerFactory.getLogger(AccountController.class);
	
	@RequestMapping(value="new", method=RequestMethod.GET)
	public String getRegistrationForm(Model model){
		AccountForm acc=new AccountForm();
		acc.setFirstName("Tedy");
		model.addAttribute("account", acc);
		return "users/registrationForm";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String postRegistrationForm(AccountForm form) {
		LOG.info("Created registration: {}", form);
		return "redirect:/users/registration_ok.html";
	}

}
