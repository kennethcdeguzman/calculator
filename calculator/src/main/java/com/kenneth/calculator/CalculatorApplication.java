package com.kenneth.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
    @Service
    public class calculator {
		int sum(int a, int b){
			return a+b;
		}
	}
}
