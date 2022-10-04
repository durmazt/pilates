package com.spring.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringLogin {
	public static void main(String[] args) {

		SpringApplication.run(SpringLogin.class, args);
	}
}
