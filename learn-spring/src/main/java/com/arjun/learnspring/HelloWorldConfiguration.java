package com.arjun.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) { };

record Address (String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Arjun";
	}
	@Bean
	public int age() {
		return 19;
	}
	@Bean
	public Person person() {
		return new Person("Arjun", 20);
	}
	@Bean
	public Address address() {
		return new Address("Khamdhrol Road", "Junagadh");
	}
}
