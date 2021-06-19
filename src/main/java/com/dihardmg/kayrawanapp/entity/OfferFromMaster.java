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
@Table(name = "offer_from_master")
@DynamicUpdate
public class OfferFromMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer offerFromId;
	
	@Column
	private String offerFrom;

	public Integer getOfferFromId() {
		return offerFromId;
	}

	public void setOfferFromId(Integer offerFromId) {
		this.offerFromId = offerFromId;
	}

	public String getOfferFrom() {
		return offerFrom;
	}

	public void setOfferFrom(String offerFrom) {
		this.offerFrom = offerFrom;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public OfferFromMaster(Integer offerFromId, String offerFrom) {
		super();
		this.offerFromId = offerFromId;
		this.offerFrom = offerFrom;
	}
	
	public OfferFromMaster(String offerFrom) {
		super();
		this.offerFrom = offerFrom;
	}

	public OfferFromMaster() {
		super();
	}
}
