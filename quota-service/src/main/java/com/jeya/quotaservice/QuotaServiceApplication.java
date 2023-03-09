package com.jeya.quotaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class QuotaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotaServiceApplication.class, args);
	}

}
