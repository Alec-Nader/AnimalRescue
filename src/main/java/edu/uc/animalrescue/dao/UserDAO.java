package edu.uc.animalrescue.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.uc.animalrescue.dto.UserDTO;

@Component
public class UserDAO implements IUserDAO {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDTO getUserById(int id) throws Exception {
		Optional<UserDTO> user = userRepository.findById(id);
		if (!user.isPresent()) {
			throw new Exception("No Results Found.");
		} 
		return user.get();
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
		return userRepository.save(user);
	}

}
