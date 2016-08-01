package com.niit.showbikes.service;

import org.springframework.stereotype.Service;

import com.niit.showbikes.dao.UserDAO;
import com.niit.showbikes.model.UserDetails;


@Service
public class Userserviceimpl implements Userservice {
private UserDAO userDAO;
	
	public void addUser(UserDetails ud){
		userDAO.addUser( ud);
	}


}
