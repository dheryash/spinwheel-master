package com.dihardmg.kayrawanapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "offer_master")
@DynamicUpdate
public class OfferMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="categoryId")
	private CategoryMaster offerCatagory;
	
	@Column
	private String offerName;
	
	@Column
	private String offerUrlForAndroid;
	
	@Column
	private double offerPayout;
	
	@Column
	private double offerPayoutToAndroid;
	
	@Column
	private Integer offerStatus;
	
	@Column
	private String IsLinkOffer;
	
	@Column
	private String submitButtonText;
	
	@Column
	private String offerShortDesc;
	
	@Column
	private String offerUrl;
	
	@Column
	private String offerUrlForIOS;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="offerFromId")
	private OfferFromMaster offerFrom;
	
	@Column
	private double offerPayoutToIOS;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="offerOrderId")
	private OfferOrderMaster offerOrder;
	
	@Column
	private String offerLinkText;
	
	@Column
	private String offerComment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CategoryMaster getOfferCatagory() {
		return offerCatagory;
	}

	public void setOfferCatagory(CategoryMaster offerCatagory) {
		this.offerCatagory = offerCatagory;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public String getOfferUrlForAndroid() {
		return offerUrlForAndroid;
	}

	public void setOfferUrlForAndroid(String offerUrlForAndroid) {
		this.offerUrlForAndroid = offerUrlForAndroid;
	}

	public double getOfferPayout() {
		return offerPayout;
	}

	public void setOfferPayout(double offerPayout) {
		this.offerPayout = offerPayout;
	}

	public double getOfferPayoutToAndroid() {
		return offerPayoutToAndroid;
	}

	public void setOfferPayoutToAndroid(double offerPayoutToAndroid) {
		this.offerPayoutToAndroid = offerPayoutToAndroid;
	}

	public Integer getOfferStatus() {
		return offerStatus;
	}

	public void setOfferStatus(Integer offerStatus) {
		this.offerStatus = offerStatus;
	}

	public String getIsLinkOffer() {
		return IsLinkOffer;
	}

	public void setIsLinkOffer(String isLinkOffer) {
		IsLinkOffer = isLinkOffer;
	}

	public String getSubmitButtonText() {
		return submitButtonText;
	}

	public void setSubmitButtonText(String submitButtonText) {
		this.submitButtonText = submitButtonText;
	}

	public String getOfferShortDesc() {
		return offerShortDesc;
	}

	public void setOfferShortDesc(String offerShortDesc) {
		this.offerShortDesc = offerShortDesc;
	}

	public String getOfferUrl() {
		return offerUrl;
	}

	public void setOfferUrl(String offerUrl) {
		this.offerUrl = offerUrl;
	}

	public String getOfferUrlForIOS() {
		return offerUrlForIOS;
	}

	public void setOfferUrlForIOS(String offerUrlForIOS) {
		this.offerUrlForIOS = offerUrlForIOS;
	}

	public OfferFromMaster getOfferFrom() {
		return offerFrom;
	}

	public void setOfferFrom(OfferFromMaster offerFrom) {
		this.offerFrom = offerFrom;
	}

	public double getOfferPayoutToIOS() {
		return offerPayoutToIOS;
	}

	public void setOfferPayoutToIOS(double offerPayoutToIOS) {
		this.offerPayoutToIOS = offerPayoutToIOS;
	}

	public OfferOrderMaster getOfferOrder() {
		return offerOrder;
	}

	public void setOfferOrder(OfferOrderMaster offerOrder) {
		this.offerOrder = offerOrder;
	}

	public String getOfferLinkText() {
		return offerLinkText;
	}

	public void setOfferLinkText(String offerLinkText) {
		this.offerLinkText = offerLinkText;
	}

	public String getOfferComment() {
		return offerComment;
	}

	public void setOfferComment(String offerComment) {
		this.offerComment = offerComment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public OfferMaster(Integer id, CategoryMaster offerCatagory, String offerName, String offerUrlForAndroid,
			double offerPayout, double offerPayoutToAndroid, Integer offerStatus, String isLinkOffer,
			String submitButtonText, String offerShortDesc, String offerUrl, String offerUrlForIOS, OfferFromMaster offerFrom,
			double offerPayoutToIOS, OfferOrderMaster offerOrder, String offerLinkText, String offerComment) {
		super();
		this.id = id;
		this.offerCatagory = offerCatagory;
		this.offerName = offerName;
		this.offerUrlForAndroid = offerUrlForAndroid;
		this.offerPayout = offerPayout;
		this.offerPayoutToAndroid = offerPayoutToAndroid;
		this.offerStatus = offerStatus;
		IsLinkOffer = isLinkOffer;
		this.submitButtonText = submitButtonText;
		this.offerShortDesc = offerShortDesc;
		this.offerUrl = offerUrl;
		this.offerUrlForIOS = offerUrlForIOS;
		this.offerFrom = offerFrom;
		this.offerPayoutToIOS = offerPayoutToIOS;
		this.offerOrder = offerOrder;
		this.offerLinkText = offerLinkText;
		this.offerComment = offerComment;
	}

	public OfferMaster(CategoryMaster offerCatagory, String offerName, String offerUrlForAndroid, double offerPayout,
			double offerPayoutToAndroid, Integer offerStatus, String isLinkOffer, String submitButtonText,
			String offerShortDesc, String offerUrl, String offerUrlForIOS, OfferFromMaster offerFrom, double offerPayoutToIOS,
			OfferOrderMaster offerOrder, String offerLinkText, String offerComment) {
		super();
		this.offerCatagory = offerCatagory;
		this.offerName = offerName;
		this.offerUrlForAndroid = offerUrlForAndroid;
		this.offerPayout = offerPayout;
		this.offerPayoutToAndroid = offerPayoutToAndroid;
		this.offerStatus = offerStatus;
		IsLinkOffer = isLinkOffer;
		this.submitButtonText = submitButtonText;
		this.offerShortDesc = offerShortDesc;
		this.offerUrl = offerUrl;
		this.offerUrlForIOS = offerUrlForIOS;
		this.offerFrom = offerFrom;
		this.offerPayoutToIOS = offerPayoutToIOS;
		this.offerOrder = offerOrder;
		this.offerLinkText = offerLinkText;
		this.offerComment = offerComment;
	}

	public OfferMaster() {
		super();
	}
}
