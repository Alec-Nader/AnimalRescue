package edu.uc.animalrescue.dao;

import java.util.List;
import java.util.Optional;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetDAO implements IPetDAO {
	
	@Autowired
	PetRepository petRepository;
	
	
	@Override
	public PetDTO getPetById(int id) throws Exception {
		
		Optional<PetDTO> pet = petRepository.findById(id);
		if (!pet.isPresent()) {
			throw new Exception("No Results Found.");
		} 
		return pet.get();
	}

	@Override
	public List<PetDTO> getPetsByName(String name) {
		return petRepository.findByName(name);
	}

	@Override
	public List<PetDTO> getPetsByIsAdoptable(boolean isAdoptable) {
		return petRepository.findByIsAdoptable(isAdoptable);
	}

	@Override
	public PetDTO save(PetDTO pet) throws Exception {
		return petRepository.save(pet);
	}

	@Override
	public List<PetDTO> fetchAll() throws Exception {
		return (List<PetDTO>)petRepository.findAll();
	}

	@Override
	public List<PetDTO> getPetsByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex) {
		return petRepository.findByBreedAndPetTypeAndSex(breed, petType, sex);
	}

}