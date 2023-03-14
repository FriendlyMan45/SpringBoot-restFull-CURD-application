package com.waran.Webapp_CURD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.waran.Webapp_CURD.entity.Product;
import com.waran.Webapp_CURD.repository.ProductRepository;

@Service
public class ProductService {
    
	@Autowired
	private ProductRepository repository;
	
	//save the single product
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	//save the list of products
	public List<Product> saveProducts(List<Product> products){
		return repository.saveAll(products);
	}
	
	
	//fetch the list product 
	public List<Product> getProducts(){
		return repository.findAll();
	}
	
	//fetch the specified product by ID
	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	//fetch the specified product by Name
//	public Product getProductByName(String name) {
//		return repository.findbyName(name);
//	}
	
	//delete the specified product by ID
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed :"+id;
	}
	
	//update the existing product with new product
	public Product updateProduct(Product product) {
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setId(product.getId());
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		
		return repository.save(existingProduct);
		
	}
	
	
}
