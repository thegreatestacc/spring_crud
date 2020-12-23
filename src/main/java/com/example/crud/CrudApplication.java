package com.example.crud;

import com.example.crud.model.Product;
import com.example.crud.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CrudApplication {
	private static final Logger logger = LoggerFactory.getLogger(CrudApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner loadData(ProductService productService) {
		return (args) -> {
			productService.createProduct(new Product("name1", "description1"));
			productService.createProduct(new Product("name2", "description2"));
			productService.createProduct(new Product("name3", "description3"));
			productService.createProduct(new Product("name4", "description4"));

			logger.info("find all");
			productService.listProducts().forEach(System.out::println);
			logger.info("find by id (1)");
			logger.info(productService.findById(1L).toString());
			logger.info("find by name (name3)");
			var product = productService.findProductByName("name3");
			logger.info(product.toString());
		};
	}*/
}
