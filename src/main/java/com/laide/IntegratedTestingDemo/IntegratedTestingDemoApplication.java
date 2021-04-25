package com.laide.IntegratedTestingDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.laide.IntegratedTestingDemo"})
public class IntegratedTestingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegratedTestingDemoApplication.class, args);
	}

}
