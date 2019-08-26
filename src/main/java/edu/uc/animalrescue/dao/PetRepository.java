package edu.uc.animalrescue.dao;

import org.springframework.data.repository.CrudRepository;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;

import java.util.List;

public interface PetRepository extends CrudRepository<PetDTO, Integer> {
    List<PetDTO> findByName(String name);
    List<PetDTO> findByIsAdoptable(boolean isAdoptable);
    List<PetDTO> findByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex);
}