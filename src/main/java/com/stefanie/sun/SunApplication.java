package com.stefanie.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SunApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunApplication.class, args);
	}
}
