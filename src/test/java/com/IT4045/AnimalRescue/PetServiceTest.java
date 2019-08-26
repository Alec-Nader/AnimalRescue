package com.IT4045.AnimalRescue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.uc.animalrescue.service.IPetService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=PetServiceTest.class)
public class PetServiceTest {

	IPetService animalService;
	
	
	@Test
	public void createAdoptionPost() {
		givenUserIsLoggedIn();
		whenUserInputsPhotoWithProfile();
		thenANewPostForPetAdoptionIsCreated();
	}
	
	@Test
	public void failCreateAdoptionPost() {
		givenUserIsLoggedIn();
		whenUserFailsToInputPhotoWithProfile();
		thenANewPostForPetAdoptionIsNotCreated();
	}
	
	private void givenUserIsLoggedIn() {	
		// TODO Auto-generated method stub
	}
	
	private void whenUserFailsToInputPhotoWithProfile() {
		// TODO Auto-generated method stub
		
	}

	private void thenANewPostForPetAdoptionIsNotCreated() {
		// TODO Auto-generated method stub
		
	}

	private void whenUserInputsPhotoWithProfile() {	
		// TODO Auto-generated method stub
	}

	private void thenANewPostForPetAdoptionIsCreated() {
		// TODO Auto-generated method stub
	}
	
	@Test
	public void AddDayToVolunteerSchedule() {
		givenUserIsLoggedIn();
		whenUserSelectsATimeAndDayTheyCanWork();
		thenTheScheduleDisplaysTheNewTime();
	}

	private void thenTheScheduleDisplaysTheNewTime() {
		// TODO Auto-generated method stub
		
	}

	private void whenUserSelectsATimeAndDayTheyCanWork() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void RemoveDayFromVolunteerSchedule() {
		givenUserIsLoggedIn();
		whenUserSelectsATimeAndDayToRemove();
		thenTheScheduleNoLongerShowsThatTime();
	}

	private void thenTheScheduleNoLongerShowsThatTime() {
		// TODO Auto-generated method stub
		
	}

	private void whenUserSelectsATimeAndDayToRemove() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void submitInformationSoICanVolunteer() {
		givenUserIsLoggedIn();
		whenUserFillsOutAllFieldsOfForm();
		thenTheInformationIsSaved();
	}

	private void whenUserFillsOutAllFieldsOfForm() {
		// TODO Auto-generated method stub
		
	}

	private void thenTheInformationIsSaved() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void failSubmitInformationSoICanVolunteer() {
		givenUserIsLoggedIn();
		whenUserFillsOutSomeFieldsOfForm();
		thenAMessageIsDisplayedToTheUser();
	}

	private void whenUserFillsOutSomeFieldsOfForm() {
		// TODO Auto-generated method stub
		
	}

	private void thenAMessageIsDisplayedToTheUser() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void submitInformationAboutAnAnimalInTrouble() {
		givenUserIsOnReportingAnimalsWebpage();
		whenUserFillsOutAllFieldsOfFormAndSubmitsInformation();
		thenAPostIsCreatedThatAnimalRescueCanRespondTo();
	}

	private void givenUserIsOnReportingAnimalsWebpage() {
		// TODO Auto-generated method stub
		
	}

	private void whenUserFillsOutAllFieldsOfFormAndSubmitsInformation() {
		// TODO Auto-generated method stub
		
	}

	private void thenAPostIsCreatedThatAnimalRescueCanRespondTo() {
		// TODO Auto-generated method stub
		
	}
	
	@Test
	public void failSubmitInformationAboutAnAnimalInTrouble() {
		givenUserIsOnReportingAnimalsWebpage();
		whenUserFillsOutSomeFieldsOfFormAndSubmitsInformation();
		thenAMessageAppearsRequestingUserToFillOutDetails();
	}

	private void whenUserFillsOutSomeFieldsOfFormAndSubmitsInformation() {
		// TODO Auto-generated method stub
		
	}

	private void thenAMessageAppearsRequestingUserToFillOutDetails() {
		// TODO Auto-generated method stub
		
	}

	
}
