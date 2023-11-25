package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.entity.ProductCategory;
import com.ecom.services.ProductCategoryService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class ProductCategoryController {

	@Autowired
	private ProductCategoryService productCategoryService;
	@GetMapping("/all")
	public List<ProductCategory> getAllProductCategory()
	{
		return productCategoryService.getAllProductCategory();
	}
}
