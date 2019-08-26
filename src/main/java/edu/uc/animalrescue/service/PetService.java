package edu.uc.animalrescue.service;

import java.util.List;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;
import edu.uc.animalrescue.dto.PhotoDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import edu.uc.animalrescue.dao.IPetDAO;
import edu.uc.animalrescue.dao.IPhotoDAO;

@Component
public class PetService implements IPetService {
	
	@Autowired
	IPetDAO petDAO;
	
	@Autowired
	IPhotoDAO photoDAO;
	
	@Override
	public PetDTO getPetById(int id) throws Exception {
		return petDAO.getPetById(id);
	}

	@Override
	public List<PetDTO> getPetsByName(String name) {
		return petDAO.getPetsByName(name);
	}

	@Override
	public List<PetDTO> getPetsByIsAdoptable(boolean isAdoptable) {
		return petDAO.getPetsByIsAdoptable(isAdoptable);
	}
	
	@Override
	public List<PetDTO> getPetsByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex) {
		return petDAO.getPetsByBreedAndPetTypeAndSex(breed, petType, sex);
	}

	@Override
	public List<PetDTO> fetchAllPets() throws Exception {
		return petDAO.fetchAll();
	}

	@Override
	public PetDTO save(PetDTO pet) throws Exception {
		return petDAO.save(pet);
	}

	@Override
	public void saveImage(MultipartFile image, PhotoDTO photo) throws Exception {
		if (!image.isEmpty()) {
			photo.setFileName(image.getOriginalFilename());
			photo.setPath("/photo/");
			photoDAO.savePhotoImage(image, photo);
			photoDAO.save(photo);
		}		
	}

	
}