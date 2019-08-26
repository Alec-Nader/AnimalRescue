package edu.uc.animalrescue.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

public class AuthenticationService implements IAuthenticationService {

	@Autowired
	IPasswordService passwordService;
	
	@Override
	public boolean authenticate(String enteredPassword, String password, String salt) {
		byte[] enteredPasswordHash = passwordService.hashPassword(enteredPassword, salt);
		byte[] storedPassword = passwordService.hashPassword(password, salt);
		return Arrays.equals(enteredPasswordHash, storedPassword);
	}
}
