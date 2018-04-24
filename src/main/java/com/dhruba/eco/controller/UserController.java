package com.dhruba.eco.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dhruba.eco.model.Users;
import com.dhruba.eco.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/register")
	public String register() {
		return "Register";
	}
	
	@PostMapping("/doRegister")
	public ModelAndView doRegister(@ModelAttribute @Valid Users user, BindingResult result) {
		if(!result.hasErrors()) {
			try {
			if(userService.doesEmailExists(user.getEmail())) {
				Users users= userService.saveUser(user);
				return new ModelAndView("Register","message","User Registered!");
			}
		}
			catch(Exception e) {
				result.rejectValue("message", "User Already Exists.");
		}
		}
		else {
			System.out.println("error");
		}
		return  new ModelAndView("Register","message","User Registration Failed!");
	}
}
	
