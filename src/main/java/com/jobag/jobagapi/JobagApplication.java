package com.jobag.jobagapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class JobagApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobagApplication.class, args);
	}

}
