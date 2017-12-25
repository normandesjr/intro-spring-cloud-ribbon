package com.hibicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudExampleWordServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudExampleWordServiceApplication.class, args);
	}
}
