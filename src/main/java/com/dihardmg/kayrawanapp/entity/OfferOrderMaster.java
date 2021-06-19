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
@Table(name = "offer_order_master")
@DynamicUpdate
public class OfferOrderMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer offerOrderId;
	
	@Column
	private Integer orderSeqNum;
	
	@Column
	private String offerOrder;

	public Integer getOfferOrderId() {
		return offerOrderId;
	}

	public void setOfferOrderId(Integer offerOrderId) {
		this.offerOrderId = offerOrderId;
	}
	
	public Integer getOrderSeqNum() {
		return orderSeqNum;
	}

	public void setOrderSeqNum(Integer orderSeqNum) {
		this.orderSeqNum = orderSeqNum;
	}

	public String getOfferOrder() {
		return offerOrder;
	}

	public void setOfferOrder(String offerOrder) {
		this.offerOrder = offerOrder;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public OfferOrderMaster(Integer offerOrderId, String offerOrder) {
		super();
		this.offerOrderId = offerOrderId;
		this.offerOrder = offerOrder;
	}

	public OfferOrderMaster(String offerOrder) {
		super();
		this.offerOrder = offerOrder;
	}

	public OfferOrderMaster() {
		super();
	}
}
