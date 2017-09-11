package com.tirumaa.cookies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.tirumaa")
public class CookiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookiesApplication.class, args);
	}
}
