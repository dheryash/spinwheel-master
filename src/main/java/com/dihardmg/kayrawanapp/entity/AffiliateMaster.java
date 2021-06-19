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
@Table(name = "affiliate_master")
@DynamicUpdate
public class AffiliateMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String password;
	
	@Column
	private String pixelDetails;
	
	@Column
	private String level;
	
	@Column
	private String affiliateType;
	
	@Column
	private String pixelPlacement;
	
	@Column
	private String scrubbing;
	
	@Column
	private String costPerLead;
	
	@Column
	private String affiliateStatus;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPixelDetails() {
		return pixelDetails;
	}

	public void setPixelDetails(String pixelDetails) {
		this.pixelDetails = pixelDetails;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getAffiliateType() {
		return affiliateType;
	}

	public void setAffiliateType(String affiliateType) {
		this.affiliateType = affiliateType;
	}

	public String getPixelPlacement() {
		return pixelPlacement;
	}

	public void setPixelPlacement(String pixelPlacement) {
		this.pixelPlacement = pixelPlacement;
	}

	public String getScrubbing() {
		return scrubbing;
	}

	public void setScrubbing(String scrubbing) {
		this.scrubbing = scrubbing;
	}

	public String getCostPerLead() {
		return costPerLead;
	}

	public void setCostPerLead(String costPerLead) {
		this.costPerLead = costPerLead;
	}

	public String getAffiliateStatus() {
		return affiliateStatus;
	}

	public void setAffiliateStatus(String affiliateStatus) {
		this.affiliateStatus = affiliateStatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AffiliateMaster(Integer id, String name, String password, String pixelDetails, String level,
			String affiliateType, String pixelPlacement, String scrubbing, String costPerLead, String affiliateStatus) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.pixelDetails = pixelDetails;
		this.level = level;
		this.affiliateType = affiliateType;
		this.pixelPlacement = pixelPlacement;
		this.scrubbing = scrubbing;
		this.costPerLead = costPerLead;
		this.affiliateStatus = affiliateStatus;
	}

	public AffiliateMaster() {
		super();
	}
}
