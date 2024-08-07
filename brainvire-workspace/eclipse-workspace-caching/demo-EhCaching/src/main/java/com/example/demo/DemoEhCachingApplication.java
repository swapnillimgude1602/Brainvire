package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoEhCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEhCachingApplication.class, args);
	}

}
