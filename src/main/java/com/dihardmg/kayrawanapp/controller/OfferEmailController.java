package com.dihardmg.kayrawanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dihardmg.kayrawanapp.entity.OfferEmail;
import com.dihardmg.kayrawanapp.repository.OfferEmailRepository;

@RestController
@RequestMapping(value="/offerEmail")
public class OfferEmailController 
{
	
	@Autowired
	private OfferEmailRepository offerEmailRepository;
	
	@PostMapping(value="/api/create")
	public String addOfferEmail(@RequestBody OfferEmail offerEmail)
	{
		offerEmailRepository.save(offerEmail);
		return "Record Inserted Succesfully....";
	}
	
	@GetMapping(value="/api/findAll")
	public Iterable<OfferEmail> findAllOfferEmail()
	{
		Iterable<OfferEmail> findAll = offerEmailRepository.findAll();
		return findAll;
	}
	
	@DeleteMapping(value="/api/deleteByID/{id}")
	public Boolean deleteOfferEmail(@PathVariable("id") Integer id)
	{
		offerEmailRepository.delete(id);
		return true;
	}
	@PutMapping(value="/api/updateOfferEmail/{id}")
	public OfferEmail updateOfferEmail(@PathVariable("id") Integer id)
	{
		OfferEmail oldOfferEmail = offerEmailRepository.findOne(id);
		oldOfferEmail.setCampaignName("KKKKKKKK");
		OfferEmail newOfferEmail = offerEmailRepository.save(oldOfferEmail);
		return newOfferEmail;
	}
}
