package com.config.myserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyserverApplication.class, args);
	}

}
