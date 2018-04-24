package com.dhruba.eco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dhruba.eco.model.Users;

public interface UserDao extends JpaRepository<Users, Integer>{
	Users findByEmail(String email);
}
