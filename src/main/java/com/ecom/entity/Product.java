package com.ecom.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	
	@ManyToOne
	@JsonBackReference
	private ProductCategory category;
	
	@Column(name="unit_price")
	private BigDecimal unit_price;
	@Column(name="image_url")
	private String image_url;
	@Column(name="product_in_stock")
	private Long product_in_stock;
	@CreationTimestamp
	private Date date_created;
	@CreationTimestamp
	private Date last_updated;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long id, String name, String description, ProductCategory category, BigDecimal unit_price,
			String image_url, Long product_in_stock, Date date_created, Date last_updated) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.unit_price = unit_price;
		this.image_url = image_url;
		this.product_in_stock = product_in_stock;
		this.date_created = date_created;
		this.last_updated = last_updated;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	public BigDecimal getUnit_price() {
		return unit_price;
	}
	public void setUnit_price(BigDecimal unit_price) {
		this.unit_price = unit_price;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Long getProduct_in_stock() {
		return product_in_stock;
	}
	public void setProduct_in_stock(Long product_in_stock) {
		this.product_in_stock = product_in_stock;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}
	
	
}
