package com.dihardmg.kayrawanapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dihardmg.kayrawanapp.entity.OfferMaster;
import com.dihardmg.kayrawanapp.repository.OfferMasterRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/offerMaster/api")
public class OfferMasterController 
{
	
	@Autowired
	private OfferMasterRepository offerMasterRepository;
	
	@PostMapping(value="/create")
	public String addOffer(@RequestBody OfferMaster offerMaster)
	{
		offerMasterRepository.save(offerMaster);
		return "Record Inserted Succesfully....";
	}
	
	@GetMapping(value="/findAll")
	public Iterable<OfferMaster> findAllOfferMaster()
	{
		Iterable<OfferMaster> findAll = offerMasterRepository.findAll();
		return findAll;
	}
	
	@GetMapping(value="/findOne/{id}")
	public OfferMaster findOneOfferMaster(@PathVariable("id") Integer id)
	{
		OfferMaster offerMaster = offerMasterRepository.findOne(id);
		return offerMaster;
	}
	
	@DeleteMapping(value="/deleteByID/{id}")
	public Boolean deleteOffer(@PathVariable("id") Integer id)
	{
		offerMasterRepository.delete(id);
		return true;
	}
	@PutMapping(value="/updateOffer/{id}")
	public OfferMaster UpdateOffer(@PathVariable("id") Integer id)
	{
		OfferMaster oldOfferMaster = offerMasterRepository.findOne(id);
		oldOfferMaster.setOfferName("KKKKKKKK");
		OfferMaster newOfferMaster = offerMasterRepository.save(oldOfferMaster);
		return newOfferMaster;
	}
}
