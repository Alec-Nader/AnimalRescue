package edu.uc.animalrescue.service;
/**
 * Authenication interface for defining methods related to authentication.
 * @author Justin Meyer
 *
 */
public interface IAuthenticationService {

	public boolean authenticate(String enteredPassword, String password, String salt);
	
}
