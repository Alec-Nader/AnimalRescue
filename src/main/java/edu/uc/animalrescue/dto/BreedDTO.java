package edu.uc.animalrescue.dto;

public class BreedDTO {
	
	private String value;
	private String name;
	private String petType;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public BreedDTO() {
		
	}

	public BreedDTO(String value, String name, String petType) {
		this.value = value;
		this.name = name;
		this.petType = petType;
	}
}
