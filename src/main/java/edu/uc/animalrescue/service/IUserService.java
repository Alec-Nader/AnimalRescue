package edu.uc.animalrescue.service;

import edu.uc.animalrescue.dto.UserDTO;

public interface IUserService {
	/**
	 * getUserById - Returns the UserDTO with the specified id, or null
	 * @param Int id
	 * @return UserDTO/null
	 * @throws Exception 
	 */
	public UserDTO getUserById(int id) throws Exception;
	
	/**
	 * getUserByUsername - Returns the UserDTO with the specified name, or null
	 * @param String username
	 * @return UserDTO/null
	 */
	public UserDTO getUserByUsername(String username);
	
	/**
	 * getUserByEmail - Returns the UserDTO with the specified email, or null
	 * @param String email
	 * @return UserDTO/null
	 */
	public UserDTO getUserByEmail(String email);
	
	/**
	 * register - Registers a new user and saves them to the database.
	 * @param UserDTO user
	 * @return UserDTO saved
	 */
	public UserDTO register(UserDTO user) throws Exception;
}
