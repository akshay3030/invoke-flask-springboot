package com.springboot.flask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages={"com.akshay.springboot.ioc.aws","com.akshay.springboot.ioc.service","com.akshay.springboot.ioc.controller","com.akshay.springboot.ioc.model"})
public class InvokeFlaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvokeFlaskApplication.class, args);
	}
}
