package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class ProductServiceApplication implements CommandLineRunner {

	@Autowired
	private PriceRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of customers
		repository.save(new Price(101l, 56.5));
		repository.save(new Price(102l, 92.8));

		// fetch all customers
		System.out.println("Products found with findAll():");
		System.out.println("-------------------------------");
		System.out.println("Price is: " + repository.findAll().get(0).getPrice());
		System.out.println();
	}
}
