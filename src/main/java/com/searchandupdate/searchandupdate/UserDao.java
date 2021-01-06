package com.searchandupdate.searchandupdate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//This UserDao is used as a repository
@Repository
public interface UserDao extends CrudRepository<User, String>{
	

}
