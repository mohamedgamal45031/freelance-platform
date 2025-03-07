package com.freelance.platform.freelance_platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.freelance.platform.freelance_platform.Repositories")  // Replace with your actual package
@EntityScan("com.freelance.platform.freelance_platform.Models")  // Replace with actual entity package
public class FreelancePlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelancePlatformApplication.class, args);
	}

}
