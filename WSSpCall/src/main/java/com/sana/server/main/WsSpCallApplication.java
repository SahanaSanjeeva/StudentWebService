package com.sana.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sana"})
public class WsSpCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsSpCallApplication.class, args);
	}
}
