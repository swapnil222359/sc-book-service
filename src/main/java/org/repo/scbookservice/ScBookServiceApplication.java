package org.repo.scbookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScBookServiceApplication.class, args);
	}
}
