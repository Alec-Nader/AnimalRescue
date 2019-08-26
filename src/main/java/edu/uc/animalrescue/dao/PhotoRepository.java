package edu.uc.animalrescue.dao;

import org.springframework.data.repository.CrudRepository;

import edu.uc.animalrescue.dto.PhotoDTO;

public interface PhotoRepository extends CrudRepository<PhotoDTO, Integer> {

}
