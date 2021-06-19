package com.dihardmg.kayrawanapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "category_master")
@DynamicUpdate
public class CategoryMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	
	@Column
	private String offerCatagory;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getOfferCatagory() {
		return offerCatagory;
	}

	public void setOfferCatagory(String offerCatagory) {
		this.offerCatagory = offerCatagory;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CategoryMaster(Integer categoryId, String offerCatagory) {
		super();
		this.categoryId = categoryId;
		this.offerCatagory = offerCatagory;
	}

	public CategoryMaster(String offerCatagory) {
		super();
		this.offerCatagory = offerCatagory;
	}

	public CategoryMaster() {
		super();
	}
}
