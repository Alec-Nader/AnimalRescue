package edu.uc.animalrescue;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.uc.animalrescue.dto.BreedDTO;
import edu.uc.animalrescue.dto.PetDTO;
import edu.uc.animalrescue.dto.PhotoDTO;
import edu.uc.animalrescue.service.IPetService;

@Controller
public class AnimalRescueController {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@ModelAttribute("breeds")
	public List<BreedDTO> populateBreeds() {
		List<BreedDTO> breeds = new ArrayList<BreedDTO>();		
		breeds.add(new BreedDTO("Beagle", "Beagle", "DOG"));
		breeds.add(new BreedDTO("Bulldog", "Bulldog", "DOG"));
		breeds.add(new BreedDTO("Chihuahua", "Chihuahua", "DOG"));
		breeds.add(new BreedDTO("German Shepherd", "German Shepherd", "DOG"));
		breeds.add(new BreedDTO("Golden Retriever", "Golden Retriever", "DOG"));
		breeds.add(new BreedDTO("Abyssinian", "Abyssinian", "CAT"));
		breeds.add(new BreedDTO("Bombay", "Bombay", "CAT"));
		breeds.add(new BreedDTO("Russian Blue", "Russian Blue", "CAT"));
		breeds.add(new BreedDTO("Siamese", "Siamese", "CAT"));
		breeds.add(new BreedDTO("Tonkinese", "Tonkinese", "CAT"));
		return breeds;
	}
	@Autowired
	private IPetService petService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/adopt")
	public ModelAndView adopt(
			@ModelAttribute("breeds") List<String> breeds, 
			@RequestParam(value="petType", required=false) PetDTO.PetType petType,
			@RequestParam(value="petSex", required=false) PetDTO.Sex petSex,
			@RequestParam(value="petBreed", required=false) String petBreed
			) 
	{
		List<PetDTO> pets = null;
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("adopt");
		if (petType != null) {
			
			try {
	            pets = petService.getPetsByBreedAndPetTypeAndSex(petBreed, petType, petSex);
	            
	        } catch (Exception e) {
	        	log.error(e.getMessage(), e);
	        }
		} else {
			
			try {
	            pets = petService.fetchAllPets();
	            
	        } catch (Exception e) {
	        	log.error(e.getMessage(), e);
	        }
		}
		
		modelAndView.addObject("petList", pets);
        modelAndView.addObject("breeds", breeds);
        
		return modelAndView;
	}
	@RequestMapping("/post")
	public ModelAndView post() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("post");
		// Instantiate our former abstract pet DTO. It is no longer abstract
		// so it can work with an initial object in the view.
		modelAndView.addObject("newPet", new PetDTO());
		return modelAndView;
	}

	@PostMapping(value="/postPet")
	public ModelAndView postPet(@RequestParam(value="image", required=false) MultipartFile image, PetDTO pet) {				
		
		ModelAndView modelAndView = new ModelAndView();
		try {
			petService.save(pet);
		} catch (Exception e) {
			log.error("unable to save pet", e);
			e.printStackTrace();
			modelAndView.setViewName("error");
			return modelAndView;
		}		
		
		PhotoDTO photoDTO = new PhotoDTO();
		try {		
			photoDTO.setPetDTO(pet);
			modelAndView.setViewName("post");
			petService.saveImage(image, photoDTO);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Error saving photo", e);
			return modelAndView;
		}
		
		modelAndView.addObject("photoDTO", photoDTO);
		modelAndView.addObject("newPet", pet);
		return modelAndView;		
	}
	
	@RequestMapping("/viewPet/{petId}")
	public ModelAndView view(@PathVariable(value="petId") int petId) {
		ModelAndView modelAndView = new ModelAndView();
		PetDTO pet = new PetDTO();
		try {
			pet = petService.getPetById(petId);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Error finding pet by id", e);
		}
		modelAndView.setViewName("viewPet");
		modelAndView.addObject("pet", pet);
		return modelAndView;
	}
	@RequestMapping("/adoption")
	public String adoption() {
		return "adoption";
	}
	@RequestMapping("/postStray")
	public String postStray() {
		return "postStray";
	}
	//Ajax mapping for the text to pull in to the view
	@RequestMapping("/viewPet.ajax")
	@ResponseBody
	public List<PetDTO> viewPet(Model model) {
        List<PetDTO> pets = null;
        try {
            pets = petService.fetchAllPets();
            model.addAttribute("petDTO", pets);
        } catch (Exception e) {
        	log.error(e.getMessage(), e);
        }
        return pets;
    }
}
