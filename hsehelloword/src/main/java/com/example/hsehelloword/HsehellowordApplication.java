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

	@GetMapping()
	public String Hans() {
		return "HURENSPOHN!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HsehellowordApplication.class, args);
	}

	

}


