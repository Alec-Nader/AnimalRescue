function loadAutoCompletejs(){
	console.log("Auto complete loaded");
	 var USStates = [
		 "Alabama",
   	  "Alaska",
   	  "Arizona",
   	  "Arkansas",
   	  "California",
   	  "Colorado",
   	  "Connecticut",
   	  "Delaware",
   	  "Florida",
   	  "Georgia",
   	  "Hawaii",
   	  "Idaho",
   	  "Illinois",
   	  "Indiana",
   	  "Iowa",
   	  "Kansas",
   	  "Kentucky",
   	  "Louisiana",
   	  "Maine",
   	  "Maryland",
   	  "Massachusetts",
   	  "Michigan",
   	  "Minnesota",
   	  "Mississippi",
   	  "Missouri",
   	  "Montana",
   	  "Nebraska",
   	  "Nevada",
   	  "New Hampshire",
   	  "New Jersey",
   	  "New Mexico",
   	  "New York",
   	  "North Carolina",
   	  "North Dakota",
   	  "Ohio",
   	  "Oklahoma",
   	  "Oregon",
   	  "Pennsylvania",
   	  "Rhode Island",
   	  "South Carolina",
   	  "South Dakota",
   	  "Tennessee",
   	  "Texas",
   	  "Utah",
   	  "Vermont",
   	  "Virginia",
   	  "Washington",
   	  "West Virginia",
   	  "Wisconsin",
   	  "Wyoming"
	    	];
	 var pets=["Beagle","Calico","Golden Retriever","Hound"];
	$( "#USstate" ).autocomplete({
	source: USStates,
	minLength: 2
	});
	    	 
	$( "#petBreedAuto" ).autocomplete({
	source: pets,
	minLength: 2
	});
}