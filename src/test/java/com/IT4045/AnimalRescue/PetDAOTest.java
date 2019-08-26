package com.IT4045.AnimalRescue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.uc.animalrescue.dao.IPetDAO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=PetDAOTest.class)
public class PetDAOTest {

	IPetDAO petDAO;
	
	@Test
	public void searchCorgiToAdopt() {
		givenUserIsOnAdoptionPage();
		whenUserSelectsCorgi();
		thenPhotosOfCorgisWithInformationIsDisplayed();
	}
	
	private void givenUserIsOnAdoptionPage() {
		// TODO Auto-generated method stub
		
	}

	private void whenUserSelectsCorgi() {		
		// TODO Auto-generated method stub
	}

	private void thenPhotosOfCorgisWithInformationIsDisplayed() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void searchBeagleToAdopt() {
		givenUserIsOnAdoptionPage();
		whenUserSelectsBeagle();
		thenPhotosOfCorgisWithInformationIsNotDisplayed();
	}
	
	private void thenPhotosOfCorgisWithInformationIsNotDisplayed() {
		// TODO Auto-generated method stub
		
	}

	private void whenUserSelectsBeagle() {
		// TODO Auto-generated method stub
		
	}
}
