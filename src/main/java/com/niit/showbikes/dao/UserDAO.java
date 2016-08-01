package com.niit.showbikes.dao;

import com.niit.showbikes.model.UserDetails;

public interface UserDAO {
	public void addUser(UserDetails ud);

	boolean  isValidUser(String un, String pd);
	  boolean  isAdmin(String name, String password);
}
