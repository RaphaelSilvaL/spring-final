package com.raphael.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.raphael.bookstore.domain.Categoria;
import com.raphael.bookstore.domain.Livro;
import com.raphael.bookstore.repositories.CategoriaRepository;
import com.raphael.bookstore.repositories.LivroRepository;

@SpringBootApplication
public class BookstoreApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}



}
