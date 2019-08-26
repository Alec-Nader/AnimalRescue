package edu.uc.animalrescue.dto;

import java.util.List;

import javax.persistence.*;

@Entity(name="pet")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PetDTO {
	
	public enum PetType { CAT, DOG }
    public enum Sex { MALE, FEMALE }
    // Lack of defaults indicates required Parameters for a pet minus id
    @Id
    @GeneratedValue
    @Column(name="pet_id")
    private int petId;
    @Column(name="name")
    private String name;
	@Column(name="breed")
    private String breed;
    @Column(name="age")
    private int age;
    @Column(name="weight")
    private int weight = 0;
    @Column(name="height")
    private int height = 0;
    @Column(name="pet_type")
    private PetType petType;
    @Column(name="sex")
    private Sex sex;
    @OneToMany(mappedBy="petDTO")
    private List<PhotoDTO> photos;
    @Column(name="is_adoptable")
    private boolean isAdoptable = false;
    @Column(name="temperament")
    private String temperament;
    @Column(name="additional_details")
    private String additionalDetails = null;
    @Column(name="has_claws")
    private boolean hasClaws = true;
    @Column(name="has_tail")
    private boolean hasTail = true;
    
    public PetDTO() {
    	
    }
    
    public PetDTO(
    		String name, 
    		String breed, 
    		int age, 
    		int weight, 
    		int height, 
    		PetType petType, 
    		Sex sex, 
    		boolean isAdoptable, 
    		String temperament, 
    		String additionalDetails,
    		boolean hasClaws,
    		boolean hasTail
    		) {
    	
    	this.name = name;
    	this.breed = breed;
    	this.age = age;
    	this.weight = weight;
    	this.height = height;
    	this.petType = petType;
    	this.sex = sex;
    	this.isAdoptable = isAdoptable;
    	this.temperament = temperament;
    	this.additionalDetails = additionalDetails;
    	this.hasClaws = hasClaws;
    	this.hasTail = hasTail;
    }

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public List<PhotoDTO> getPhotos() {
		return photos;
	}

	public void setPhotos(List<PhotoDTO> photos) {
		this.photos = photos;
	}

	public boolean getIsAdoptable() {
		return isAdoptable;
	}

	public void setIsAdoptable(boolean isAdoptable) {
		this.isAdoptable = isAdoptable;
	}

	public String getTemperament() {
		return temperament;
	}

	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}

	public String getAdditionalDetails() {
		return additionalDetails;
	}

	public void setAdditionalDetails(String additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	public boolean isHasClaws() {
		return hasClaws;
	}

	public void setHasClaws(boolean hasClaws) {
		this.hasClaws = hasClaws;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	@Override
	public String toString() {
		return "PetDTO [name=" + name + ", breed=" + breed + ", age=" + age + ", weight=" + weight + ", height="
				+ height + ", petType=" + petType + ", sex=" + sex + ", photos=" + photos + ", isAdoptable="
				+ isAdoptable + ", temperament=" + temperament + ", additionalDetails=" + additionalDetails
				+ ", hasClaws=" + hasClaws + ", hasTail=" + hasTail + "]";
	}
}