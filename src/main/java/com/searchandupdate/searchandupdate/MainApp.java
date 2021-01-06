package com.searchandupdate.searchandupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//This class is used for mapping UserService
@Controller
@RequestMapping("/main")
public class MainApp {
	
@Autowired
private UserService userService;
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)

	public String register() {
		return "register";
	}
	
	@RequestMapping(value = "/updateuser", method = RequestMethod.GET)

	public String updateUser() {
		return "updateuser";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)

	public String home() {
		return "home";
	}
}
