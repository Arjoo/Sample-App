package com.learning.Sample.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SampleAppApplication.class, args);
		System.out.println("Hello world");
	}

}
