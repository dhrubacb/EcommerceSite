package com.dhruba.eco.service;

import com.dhruba.eco.exception.UserExistsException;
import com.dhruba.eco.model.Users;

public interface UserService {
	boolean doesEmailExists(String email) throws UserExistsException;
	Users saveUser(Users user);
}
