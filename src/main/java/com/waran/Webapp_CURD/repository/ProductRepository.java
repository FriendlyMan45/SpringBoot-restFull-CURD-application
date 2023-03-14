package com.waran.Webapp_CURD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waran.Webapp_CURD.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

//	Product findbyName(String name);
	
	

}
