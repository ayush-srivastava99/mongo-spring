package com.ayush.mongodemo;

import com.ayush.mongodemo.domain.Product;
import com.ayush.mongodemo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class MongodemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodemoApplication.class, args);
	}

	/*  Command line args to insert documents into MongoDB
	@Bean
	public CommandLineRunner commandLineRunner(
ProductRepository repository
	){
		return args->{
			var product= Product.builder().name("Phone").description("mobile").tags(Collections.singletonMap("brand","apple")).build();
			repository.insert(product);
		};
	}
	*/


}
