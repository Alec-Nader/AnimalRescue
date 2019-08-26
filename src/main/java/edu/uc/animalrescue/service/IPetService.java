package edu.uc.animalrescue.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;
import edu.uc.animalrescue.dto.PhotoDTO;

/**
 * @author Justin Meyer
 *
 */
public interface IPetService {
	
	/**
	 * getPetById - Gets the PetDTO by the passed in id
	 * @param id
	 * @return PetDTO
	 * @throws Exception 
	 */
	PetDTO getPetById(int id) throws Exception;
	
	/**
	 * getPetByName - Gets the PetDTO by name
	 * @param name
	 * @return PetDTO
	 */
	List<PetDTO> getPetsByName(String name);

	/**
	 * getPetsByIsAdoptable - Returns the list of pets based on their
	 * adoptable status.
	 * @param isAdoptable - Boolean indicating the adoptable status
	 * of the pet.
	 * @return a list of Pets.
	 */
	List<PetDTO> getPetsByIsAdoptable(boolean isAdoptable);
	
	/**
	 * fetchAllPets - Fetches all PetDTO's from the database
	 * @return a list of PetDTO's in the database.
	 * @throws Exception 
	 */
	List<PetDTO> fetchAllPets() throws Exception;
	
	/**
	 * save - Persists the pet object to the database.
	 * @param pet - A pet object.
	 * @return AbstractPetDTO - Original object saved if successful.
	 * @throws Exception 
	 */
	PetDTO save(PetDTO pet) throws Exception;
	
	/**
	 * saveImage - Saves the image to the local file system and database.
	 * @param imageFile - The actual image to save
	 * @param photoDTO - The metadata of the image that we are saving.
	 * @throws Exception
	 */
	void saveImage(MultipartFile imageFile, PhotoDTO photoDTO) throws Exception;

	List<PetDTO> getPetsByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex);
	
}