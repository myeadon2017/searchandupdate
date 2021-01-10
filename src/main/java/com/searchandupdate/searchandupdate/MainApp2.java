package com.searchandupdate.searchandupdate;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//This class is used as a rest controller
@RestController
@RequestMapping("/main")
public class MainApp2 {
	@Autowired
	private UserService userService;
		
	@PostMapping("/register")
	public String addUser(@RequestParam("uname")String name,@RequestParam("pass")String pass,@RequestParam("city")String city) {
		
		if(userService.addUser(name, pass, city)) {
			Optional<User> mv = userService.findAUser(name);
			String info = mv.get().toString();
			return info;
		}
		return "register failed";
	}
	@PostMapping("/updateuser")
	public String updateUser(@RequestParam("uname") String name,
			@RequestParam("pass") String pass,
			@RequestParam("city") String city) {
		if (userService.updateUser(name,pass,city)) {
			Optional<User> mv = userService.findAUser(name);
			String info = mv.get().toString();
			return info;
		}
		return "Incorrect search info";
	}

	@GetMapping("/loadusers")
	public List<User> load(){
		return userService.loadUsers();
	}
	
}
	
