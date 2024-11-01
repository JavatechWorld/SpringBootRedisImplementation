package com.codeWithRaman.implementation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SprintbootRedisImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintbootRedisImplApplication.class, args);
	}

}
