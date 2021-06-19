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

import com.dihardmg.kayrawanapp.entity.AffiliateMaster;
import com.dihardmg.kayrawanapp.repository.AffiliateMasterRepository;

@RestController
@RequestMapping(value="/affiliateMaster")
public class AffiliateMasterController 
{
	
	@Autowired
	private AffiliateMasterRepository affiliateMasterRepository;
	
	@PostMapping(value="/api/create")
	public String addAffiliate(@RequestBody AffiliateMaster affiliateMaster)
	{
		affiliateMasterRepository.save(affiliateMaster);
		return "Record Inserted Succesfully....";
	}
	
	@GetMapping(value="/api/findAll")
	public Iterable<AffiliateMaster> findAllAffiliateMaster()
	{
		Iterable<AffiliateMaster> findAll = affiliateMasterRepository.findAll();
		return findAll;
	}
	
	@DeleteMapping(value="/api/deleteByID/{id}")
	public Boolean deleteAffiliate(@PathVariable("id") Integer id)
	{
		affiliateMasterRepository.delete(id);
		return true;
	}
	@PutMapping(value="/api/updateAffiliate/{id}")
	public AffiliateMaster UpdateAffiliate(@PathVariable("id") Integer id)
	{
		AffiliateMaster oldAffiliateMaster = affiliateMasterRepository.findOne(id);
		oldAffiliateMaster.setName("KKKKKKKK");
		AffiliateMaster newAffiliateMaster = affiliateMasterRepository.save(oldAffiliateMaster);
		return newAffiliateMaster;
	}
}
