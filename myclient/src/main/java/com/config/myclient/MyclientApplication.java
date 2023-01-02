package com.config.myclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyclientApplication {
	@Value("${welcome.message}")
	String welcomeText;

	@Value("${user.role}")
	String role;

	public static void main(String[] args) {
		SpringApplication.run(MyclientApplication.class, args);
		MyclientApplication m = new MyclientApplication();
		System.out.println(m.welcomeText);
	}

	@GetMapping(value = "/whoami/{username}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String whoami(@PathVariable("username") String username) {
		return String.format("Hello! You're %s and you'll become a(n) %s...\n", username, role);
	}
	
	@RequestMapping(value = "/")
	public String welcomeText() {
		return welcomeText;
	}
	
}
