package com.dihardmg.kayrawanapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coregmaster")
public class CoregMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String offerName;
	
	@Column
	private String payout;
	
	@Column
	private String displayText;
	
	@Column
	private String tcpa;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getPayout() {
		return payout;
	}

	public void setPayout(String payout) {
		this.payout = payout;
	}

	public String getDisplayText() {
		return displayText;
	}

	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

	public String getTcpa() {
		return tcpa;
	}

	public void setTcpa(String tcpa) {
		this.tcpa = tcpa;
	}

	public CoregMaster() {
		super();
	}

	public CoregMaster(Integer id, String offerName, String payout, String displayText, String tcpa) {
		super();
		this.id = id;
		this.offerName = offerName;
		this.payout = payout;
		this.displayText = displayText;
		this.tcpa = tcpa;
	}

	public CoregMaster(String offerName, String payout, String displayText, String tcpa) {
		super();
		this.offerName = offerName;
		this.payout = payout;
		this.displayText = displayText;
		this.tcpa = tcpa;
	}	
}
