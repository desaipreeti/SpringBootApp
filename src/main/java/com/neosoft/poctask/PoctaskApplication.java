package com.neosoft.poctask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class PoctaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoctaskApplication.class, args);
		System.out.println("This is poc task");
	}

}
