package com.exercicio.webservice.entity.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exercicio.webservice.entity.Product;
import com.exercicio.webservice.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product>findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product>product= repository.findById(id);
		
		return product.get();
		
	}

}
