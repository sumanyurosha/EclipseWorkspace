package com.fil.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fil")
public class SpringDemo {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringDemo.class, args);

	}

}
