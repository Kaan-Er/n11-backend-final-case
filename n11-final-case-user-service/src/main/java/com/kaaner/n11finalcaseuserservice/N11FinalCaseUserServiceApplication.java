package com.kaaner.n11finalcaseuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class N11FinalCaseUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(N11FinalCaseUserServiceApplication.class, args);
	}

}
