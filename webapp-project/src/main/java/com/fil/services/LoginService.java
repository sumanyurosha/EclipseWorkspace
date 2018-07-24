package com.fil.services;

public class LoginService {
	
	public boolean validateUser(String name, String password){
		if(name.equals(password))
			return true;
		else 
			return false;
	}

}
