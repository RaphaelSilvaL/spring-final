package com.raphael.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raphael.bookstore.domain.Categoria;
import com.raphael.bookstore.domain.Livro;
import com.raphael.bookstore.repositories.CategoriaRepository;
import com.raphael.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public void instaciaBaseDeDados() {
	
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Fantasia", "Sherek");
		Categoria cat3 = new Categoria(null, "Misterio", "Chupa c#");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Loren ipsun", cat1);
		Livro l2 = new Livro(null, "irineu Code", "Robert patin", "Loren ipsun", cat1);
		Livro l3 = new Livro(null, "irininha Code", "Robert lartin", "Loren ipsun", cat2);
		Livro l4 = new Livro(null, "irei Code", "Robert zartin", "Loren ipsun", cat2);
		Livro l5 = new Livro(null, "num sei Code", "Robert qartin", "Loren ipsun", cat2);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));
		

		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));
	}

}
