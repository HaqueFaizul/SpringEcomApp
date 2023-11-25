package com.ecom.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.entity.ProductCategory;
import com.ecom.repo.ProductCategoryRepository;

@Service
public class ProductCategoryService {
	@Autowired
	private ProductCategoryRepository productCategoryRepo;
	
	public List<ProductCategory> getAllProductCategory()
	{
		return productCategoryRepo.findAll();
	}
 
}
