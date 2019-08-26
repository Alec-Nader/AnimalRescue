package edu.uc.animalrescue.dao;

import java.util.ArrayList;
import java.util.List;

import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PetDTO.PetType;
import edu.uc.animalrescue.dto.PetDTO.Sex;


public class PetDAOStub implements IPetDAO {
	@Override
	public PetDTO getPetById(int id) throws Exception {
		PetDTO pet = new PetDTO(
				"GiGi", 
				"Bombay", 
				16, 
				12, 
				9, 
				PetDTO.PetType.CAT, 
				PetDTO.Sex.FEMALE, 
				true, 
				"Rowdy",
				"Cat that loves to jump on vehicle when arriving home.", 
				true, 
				true);
		
		pet.setPetId(42);
		if (pet.getPetId() == id) {
			return pet;
		} else {
			throw new Exception("No Results Found.");
		}
	}

	@Override
	public List<PetDTO> getPetsByName(String Name) {
		return null;
	}

	@Override
	public List<PetDTO> getPetsByIsAdoptable(boolean isAdoptable) {
		return null;
	}

	@Override
	public PetDTO save(PetDTO pet) {
		return null;
	}

	@Override
	public List<PetDTO> fetchAll() throws Exception {
		List<PetDTO> pets = new ArrayList<>();
		PetDTO pet = new PetDTO(
				"GiGi", 
				"Bombay", 
				16, 
				12,
				9, 
				PetDTO.PetType.CAT, 
				PetDTO.Sex.MALE, 
				true, 
				"Rowdy", 
				"Cat that loves to jump on vehicle when arriving home.", 
				true, 
				true);
		
		pet.setPetId(42);
		PetDTO pet2 = new PetDTO(
				"Kilala", 
				"German Shepherd", 
				15, 
				50, 
				8, 
				PetDTO.PetType.DOG, 
				PetDTO.Sex.MALE, 
				true, 
				"Calm", 
				"Cute German Shepard that loves attention and is a great huge lap dog.", 
				true, 
				true);
		
		pet2.setPetId(43);
		PetDTO pet3 = new PetDTO(
				"Martin", 
				"Golden Retriever", 
				7, 
				90, 
				14, 
				PetDTO.PetType.DOG, 
				PetDTO.Sex.MALE, 
				true, 
				"Calm", 
				"Cute Golden Retriever that needs a home!", 
				true, 
				true);
		
		pet3.setPetId(44);
		PetDTO pet4 = new PetDTO(
				"Puggy", 
				"Chihuahua", 
				5, 
				12, 
				8, 
				PetDTO.PetType.DOG, 
				PetDTO.Sex.MALE, 
				true, 
				"Shy", 
				"Shy Chihuahua that takes awhile to warm up to people but is a lapdog once he does.", 
				true, 
				true);
		
		pet4.setPetId(45);
		PetDTO pet5 = new PetDTO(
				"Janna", 
				"Russian Blue", 
				2, 
				5, 
				6, 
				PetDTO.PetType.CAT, 
				PetDTO.Sex.FEMALE, 
				false, 
				"Scared", 
				"Scared and abused cat that has recently been removed from an abusive household. Needs more love and care before she can be adopted.", 
				true, 
				false);
		
		pet5.setPetId(46);
		PetDTO pet6 = new PetDTO(
				"Munchkin", 
				"Abyssinian", 
				5, 
				20, 
				8, 
				PetDTO.PetType.CAT, 
				PetDTO.Sex.FEMALE, 
				true, 
				"Cuddly", 
				"Extremely cuddly Abyssinian. Brushing required! :3", 
				true, 
				true);
		
		pet6.setPetId(47);
		PetDTO pet7 = new PetDTO(
				"Buck", 
				"Bull Dog", 
				6, 
				40, 
				12, 
				PetDTO.PetType.DOG, 
				PetDTO.Sex.MALE, 
				true, 
				"Calm", 
				"Friendly and calm bull dog in need of a loving home. Loves people.", 
				true, 
				true);
		
		pet7.setPetId(48);
		PetDTO pet8 = new PetDTO(
				"Lila", 
				"Siamese", 
				3, 
				15, 
				7, 
				PetDTO.PetType.CAT, 
				PetDTO.Sex.FEMALE, 
				true, 
				"Mischevious", 
				"Mischevious cat that is friendly but has a short temper.", 
				true, 
				true);
		
		pet8.setPetId(49);
		PetDTO pet9 = new PetDTO(
				"Ralph", 
				"Tonkinese", 
				8, 
				12, 
				9, 
				PetDTO.PetType.CAT, 
				PetDTO.Sex.MALE, 
				true, 
				"Calm", 
				"Calm Tonkinese cat that is friendly with adults but not children.", 
				true, 
				true);
		
		pet9.setPetId(50);	
		PetDTO pet10 = new PetDTO(
				"Wishbone",
				"Beagle",
				3,
				15, 
				10, 
				PetDTO.PetType.DOG, 
				PetDTO.Sex.MALE, 
				true, 
				"Dreamer", 
				"Loves to dream about historical figures in the past.", 
				true, 
				true);
		
		pet10.setPetId(51);
		pets.add(pet);
		pets.add(pet2);
		pets.add(pet3);
		pets.add(pet4);
		pets.add(pet5);
		pets.add(pet6);
		pets.add(pet7);
		pets.add(pet8);
		pets.add(pet9);
		pets.add(pet10);

		return pets;
	}

	@Override
	public List<PetDTO> getPetsByBreedAndPetTypeAndSex(String breed, PetType petType, Sex sex) {
		// TODO Auto-generated method stub
		return null;
	}

}