package com.dhruba.eco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhruba.eco.dao.UserDao;
import com.dhruba.eco.exception.UserExistsException;
import com.dhruba.eco.model.UserType;
import com.dhruba.eco.model.Users;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public boolean doesEmailExists(String email) throws UserExistsException{
		if(userDao.findByEmail(email)!=null)
		throw new UserExistsException();
		return true;
	}

	@Override
	public Users saveUser(Users user) {
		// TODO Auto-generated method stub
		try {
		UserType type=new UserType();
		type.setType("user");
		user.setType(type);
		user.setImage("nk");
		return userDao.save(user);
		}
		catch(Exception e) {
			return null;
		}
	}
	
}
