package edu.uc.animalrescue.service;

import java.util.List;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;
import edu.uc.animalrescue.dto.PhotoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import edu.uc.animalrescue.dao.IPetDAO;


public class PetServiceStub implements IPetService {
	
	@Autowired
	IPetDAO petDAOStub;
	
	@Override
	public PetDTO getPetById(int id) throws Exception {
		return petDAOStub.getPetById(id);
	}

	@Override
	public List<PetDTO> getPetsByName(String name) {
		return null;
	}

	@Override
	public List<PetDTO> getPetsByIsAdoptable(boolean isAdoptable) {
		return null;
	}

	@Override
	public List<PetDTO> fetchAllPets() throws Exception {
		return petDAOStub.fetchAll();
	}

	@Override
	public PetDTO save(PetDTO pet) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveImage(MultipartFile imageFile, PhotoDTO photoDTO) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PetDTO> getPetsByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex) {
		// TODO Auto-generated method stub
		return null;
	}

	
}