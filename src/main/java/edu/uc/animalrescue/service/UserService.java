package edu.uc.animalrescue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.uc.animalrescue.dao.IUserDAO;
import edu.uc.animalrescue.dto.UserDTO;

@Component
public class UserService implements IUserService {
	@Autowired
	IUserDAO userDAO;

	@Autowired
	IPasswordService passwordService;
	
	@Override
	public UserDTO getUserById(int id) throws Exception {
		return userDAO.getUserById(id);
	}

	@Override
	public UserDTO getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO register(UserDTO user) throws Exception {
		String password = user.getPassword();
		String salt = new String(passwordService.generateSalt());
		String hashedPassword = new String(passwordService.hashPassword(password, salt));
		user.setPassword(hashedPassword);
		user.setSalt(salt);
		return userDAO.register(user);
	}

}
