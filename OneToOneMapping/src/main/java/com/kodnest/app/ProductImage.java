package com.kodnest.app;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class ProductImage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int pimageid;
	
	@Column
	String pimageurl;

	public ProductImage() {
		super();
	}

	public ProductImage(String pimageurl) {
		super();
		this.pimageurl = pimageurl;
	}

	public ProductImage(int pimageid, String pimageurl) {
		super();
		this.pimageid = pimageid;
		this.pimageurl = pimageurl;
	}

	public int getPimageid() {
		return pimageid;
	}

	public void setPimageid(int pimageid) {
		this.pimageid = pimageid;
	}

	public String getPimageurl() {
		return pimageurl;
	}

	public void setPimageurl(String pimageurl) {
		this.pimageurl = pimageurl;
	}
	
}
