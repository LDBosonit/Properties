package com.example.ej5.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Value("${greeting}")
	private String greeting;
	@Value("${my.number}")
	private int myNumber;
	@Value("${new.property}")
	private String newProperty;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("El valor de greeting es:" + greeting + " El valor de my.number es:" + myNumber);
		System.out.println("Valor de newProperty:" + newProperty);
		//La variable newProperty no se puede ejecutar porque no esta en application.properties.
	}
}
