package com.searchandupdate.searchandupdate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//This class is used for my application entry point
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com")
@EntityScan(basePackages = "com")
public class SearchandupdateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchandupdateApplication.class, args);
	}

}
