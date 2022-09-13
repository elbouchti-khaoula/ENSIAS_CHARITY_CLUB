package com.cindh.project.cindh_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude ={ SecurityAutoConfiguration.class })
@RestController


public class CindhProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(CindhProjectApplication.class, args);
	}
	@GetMapping()
	public String h(){
		return "hello world";
	}
}
