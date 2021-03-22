package com.example.hsehelloword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HsehellowordApplication {

	private String state = "no_state";

	@GetMapping()
	public String HalloMarcel() {
		return "Hallo Marcel das ist deine Webseite";
	}

	@GetMapping("/otherEndpoint")
	public String helloMAgain(){
		return "Hallo ich bins wieder hast du den Müll rausgebracht?";
	}

	@PostMapping("/somePost/{stringParam}")
	public String withInput(@PathVariable String stringParam){
		state = stringParam;
		return "Diesen String habe ich erhalten: " + stringParam;
	}

	public static void main(String[] args) {
		SpringApplication.run(HsehellowordApplication.class, args);
	}

	

}


