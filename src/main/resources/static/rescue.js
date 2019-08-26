function loadAdopt(){
	//Here is a javscript function for pulling the object as JSON. This way I can filter the data as I need it.
	console.log("Started");
	//Ajax function to call the data from viewPet.ajax page
	$.ajax({url: "viewPet.ajax",
		dataType:"json",
		success: function(results){
		console.log(results);
		console.log(results.breed);
		var length = results.length;
		
		
		
		//Currently we have one pet in our stub so I will only be able to obtain one.
		results.forEach(result => {
			let nameAge ="<p>Name: "+ result.name +"<br>"+"Age: "+result.age+"</p>";
			let weight ="<p>Weight: " +result.weight+"</p>";
			let height ="<p>Height: " +result.height+"</p>";
			let breed = "<p>"+result.breed+"</p>";
			let temperament = "<p>"+result.temperament+"</p>";
			// result.additionalDetails should be used, but Thymeleaf is modifying it to details.
			let details = "<p>"+result.details+"</p>";
			populateCard(nameAge, weight, height, breed, temperament, details);
		})
		
	}
	});
}
/**
 * A function which populates an html card with the pet information from the ajax call above
 * @param nameAge
 * @param weight
 * @param height
 * @param breed
 * @param temperament
 * @param details
 * @returns
 */
function populateCard(nameAge, weight, height, breed, temperament, details){
	console.log(nameAge);
	$(".petName").html(nameAge);
	$(".petWeight").html(weight);
	$(".petHeight").html(height);
	$(".petInfoCard").html(breed);
	$(".petInfoCard2").html(temperament);
	$(".petInfoCard3").html(details);
}
function popmodal(){
	$("#modal1").modal("show");
}
function modalContinue(){
	alert("Thank you for the submission");
	$("#modal1").modal("hide");
}
function postSubmit(){
	alert("Thank you for the submission");
}
function loadPost(){
	console.log("Load post");
	var availableTags = ["Beagle", "Hound", "Calico", "Golden Retriever", "Mix"];
	$("#petBreedAuto").autocomplete(availableTags);
}

function initLinkedSelect(from,to) {

	  /* Array for storing option text/value pairs */     
	let fromElement = document.getElementById(from);
	let toElement = document.getElementById(to);
	  var options = new Array();  

	  for (var i=0; i < toElement.options.length; i++) {

	    /* Save text and value of original options */       

	    options[i] = new Array(toElement.options[i].text,toElement.options[i].value, toElement.options[i].dataset.petType);     

	  } 

	  /* When the Pet Type selection changes... */     

	  fromElement.onchange = function() {

	    /* The code for the selected Breed */       

	    var fromCode = fromElement.options[fromElement.selectedIndex].value;

	    /* Remove current options */       

	    toElement.options.length = 0;

	    /* Run throught all options... */       

	    for (i = 0; i < options.length; i++) {

	      /* If the option starts with the selected petType */         

	      if (options[i][2].indexOf(fromCode) == 0) {

	        /* Add the option to the breed select */           

	    	  toElement.options[toElement.options.length] = new Option(options[i][0],options[i][1]);

	      }

	    } 

	    /* Select the first of the new options */       

	    toElement.options[0].selected = true;

	  }

	  /* Update the breed select now */     

	  fromElement.onchange();

	}
	 
