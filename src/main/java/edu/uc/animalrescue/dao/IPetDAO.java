package edu.uc.animalrescue.dao;

import java.util.List;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;

/**
 * @author Justin Meyer
 *
 */
public interface IPetDAO {
	
	/**
	 * getPetById - Returns the AbstractPet with the specified id, or null
	 * @param Int id
	 * @return AbstractPetDTO/null
	 * @throws Exception 
	 */
	PetDTO getPetById(int id) throws Exception;
	
	/**
	 * getPetByName - Returns the list of AbstractPets with the specified name, or null
	 * @param String Name
	 * @return AbstractPet/null
	 */
	List<PetDTO> getPetsByName(String Name);
	
	/**
	 * save - Saves the pet in the database
	 * @param PetDTO pet
	 * @return AbstracPetDTO which is the object saved if successful
	 */
	PetDTO save(PetDTO pet) throws Exception;
	
	/**
	 * fetchAll - Returns a List of Pet objects that exist in the database
	 * @return the list of Pet objects in the database
	 * @throws Exception 
	 */
	List<PetDTO> fetchAll() throws Exception;

	/**
	 *
	 * @param isAdoptable - adoption status of pet
	 * @return the list of AbstractPets by adoption status
	 */
	List<PetDTO> getPetsByIsAdoptable(boolean isAdoptable);

	List<PetDTO> getPetsByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex);
}
