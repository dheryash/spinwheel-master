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
@Table(name = "offer_email")
@DynamicUpdate
public class OfferEmail implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	private String campaignName;

	@Column
	private String campaignSubject;

	@Column
	private String fromName;

	@Column
	private String fromEmail;

	@Column
	private String selectUsers;

	@Column
	private String selectOffer;

	@Column
	private String offerCreative;

	@Column
	private String sendingServerSelection;

	@Column
	private String submitButtonText;

	@Column
	private String shortDescription;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getCampaignSubject() {
		return campaignSubject;
	}

	public void setCampaignSubject(String campaignSubject) {
		this.campaignSubject = campaignSubject;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getSelectUsers() {
		return selectUsers;
	}

	public void setSelectUsers(String selectUsers) {
		this.selectUsers = selectUsers;
	}

	public String getSelectOffer() {
		return selectOffer;
	}

	public void setSelectOffer(String selectOffer) {
		this.selectOffer = selectOffer;
	}

	public String getOfferCreative() {
		return offerCreative;
	}

	public void setOfferCreative(String offerCreative) {
		this.offerCreative = offerCreative;
	}

	public String getSendingServerSelection() {
		return sendingServerSelection;
	}

	public void setSendingServerSelection(String sendingServerSelection) {
		this.sendingServerSelection = sendingServerSelection;
	}

	public String getSubmitButtonText() {
		return submitButtonText;
	}

	public void setSubmitButtonText(String submitButtonText) {
		this.submitButtonText = submitButtonText;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public OfferEmail(Integer id, String campaignName, String campaignSubject, String fromName, String fromEmail,
			String selectUsers, String selectOffer, String offerCreative, String sendingServerSelection,
			String submitButtonText, String shortDescription) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignSubject = campaignSubject;
		this.fromName = fromName;
		this.fromEmail = fromEmail;
		this.selectUsers = selectUsers;
		this.selectOffer = selectOffer;
		this.offerCreative = offerCreative;
		this.sendingServerSelection = sendingServerSelection;
		this.submitButtonText = submitButtonText;
		this.shortDescription = shortDescription;
	}

	public OfferEmail() {
		super();
	}
}
