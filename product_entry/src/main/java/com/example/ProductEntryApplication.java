package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductEntryApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(ProductEntryApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		/*repository.deleteAll();

		// save a couple of customers
		repository.save(new Product("хлеб"));
		repository.save(new Product("молоко"));

		// fetch all customers
		System.out.println("Products found with findAll():");
		System.out.println("-------------------------------");
		System.out.println("Price is: " + repository.findByName("молоко").get(0).getName());
		System.out.println();*/
	}
}
