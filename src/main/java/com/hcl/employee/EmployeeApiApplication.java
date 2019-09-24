package com.hcl.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Laxman
 * @date 19 SEPT 2019
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EmployeeApiApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApiApplication.class, args);
	}

}
