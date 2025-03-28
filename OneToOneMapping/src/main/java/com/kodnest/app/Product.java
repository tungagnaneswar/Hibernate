package com.kodnest.app;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productid;
	
	@Column
	String productname;
	
	@Column
	int price;
	
	@Column
	int stock;
	
	
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name="pimageid", referencedColumnName = "pimageid")
	ProductImage image;

	public Product() {
		super();
	}
	
	public Product(int productid, String productname, int price, int stock, ProductImage image) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
		this.stock = stock;
		this.image = image;
	}

	public Product(String productname, int price, int stock, ProductImage image) {
		super();
		this.productname = productname;
		this.price = price;
		this.stock = stock;
		this.image = image;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public ProductImage getImage() {
		return image;
	}

	public void setPimageid(ProductImage image) {
		this.image = image;
	}
	
}
