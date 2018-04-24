package com.dhruba.eco.exception;

public class UserExistsException extends Exception {
	public UserExistsException(){
	super("User already exists! Try another email!");
	}
}
