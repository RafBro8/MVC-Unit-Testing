package com.alpha.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class UnitTestingApplication {

    public static void main(String[] args) {
		SpringApplication.run(UnitTestingApplication.class, args);
	}
}
