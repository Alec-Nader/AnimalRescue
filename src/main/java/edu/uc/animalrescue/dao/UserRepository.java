package edu.uc.animalrescue.dao;

import org.springframework.data.repository.CrudRepository;

import edu.uc.animalrescue.dto.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO, Integer> {

}
