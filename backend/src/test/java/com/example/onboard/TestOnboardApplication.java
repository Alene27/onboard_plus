package com.example.onboard;

import org.springframework.boot.SpringApplication;

public class TestOnboardApplication {

	public static void main(String[] args) {
		SpringApplication.from(OnboardApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
