package com.searchandupdate.searchandupdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



//This class is used as User Service class in order to register and update users
@Service
public class UserService {

	
	@Autowired
	private UserDao userDao;
	
	public boolean addUser(String uname, String pass, String city) {
		
		userDao.save(new User(uname, pass, city));
		return true;
	
	}

public boolean updateUser(String name, String password, String city) {
	Optional<User> logi = userDao.findById(name);
	if (logi.isPresent()) {
		User login = userDao.findById(name).get();
		login.setPass(password);
		login.setCity(city);
		userDao.save(login);
		return true;
	} else {
		return false;
	}

}
public Optional<User> findAUser(String uname){
	Optional<User> mv = userDao.findById(uname);
	return mv;	
}

public List<User> loadUsers(){
	List<User> ul=(List) userDao.findAll();
	return ul;
}

}


