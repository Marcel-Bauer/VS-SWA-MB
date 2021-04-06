package com.example.TestSpringInit;


import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@RestController
public class TestSpringInitApplication {

	ArrayList<String> listOfStrings = new ArrayList<String>();
	private Logger logger = LoggerFactory.getLogger(TestSpringInitApplication.class);
	
	@GetMapping("/strings")
	public String readStrings(){

		System.out.println("Strings beeing returned: "+listOfStrings.toString());
		return listOfStrings.toString();
	}
	
	@PostMapping("/strings/{newString}")
	public String addNewString(@PathVariable String newString){

		logger.error("String to add: {}",newString);
		listOfStrings.add(newString);
		logger.debug("Current list of strings {}",listOfStrings);
		return newString+" has been added to the list";

	}
	@PutMapping("/strings/{oldString}/{newString}")
	public String updateString(@PathVariable String newString){

			// Todo :-)
			return "nothing happend with " + newString;
	}

	@DeleteMapping("/strings/{stringToDelete}")
	public String deleteString(@PathVariable String stringToDelete){

		logger.info("String to delete : {}",stringToDelete);
		listOfStrings.remove(stringToDelete);
		logger.debug("Current list of strings {}",listOfStrings);
		return stringToDelete+" has most likely been removed from the list";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestSpringInitApplication.class, args);
	}

}
