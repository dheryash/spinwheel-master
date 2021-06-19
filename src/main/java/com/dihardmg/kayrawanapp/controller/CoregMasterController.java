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
import com.dihardmg.kayrawanapp.entity.CoregMaster;
import com.dihardmg.kayrawanapp.repository.CoregMasterRepository;

@RestController
@RequestMapping(value="/coregMaster")
public class CoregMasterController 
{
	@Autowired
	private CoregMasterRepository CoregMasterRepository;
	
	@PostMapping(value="/api/addCoreg")
	public String addCoregMaster(@RequestBody CoregMaster coregMaster)
	{
		CoregMasterRepository.save(coregMaster);
		return "Saved Succesfully....";
	}
	@GetMapping(value="/api/findAll")
	public Iterable<CoregMaster> findAllCoreg()
	{
		return CoregMasterRepository.findAll();
	}
	
	@DeleteMapping(value="/api/deleteCoreg/{id}")
	public String deleteCoreg(@PathVariable("id") Integer id)
	{
		CoregMasterRepository.delete(id);
		return "Deleted Succesfully Done";
	}
	
	@PutMapping(value="/api/updateCoreg/{id}")
	public CoregMaster update(@PathVariable("id") Integer id)
	{
		CoregMaster oldCoreg = CoregMasterRepository.findOne(id);
		oldCoreg.setOfferName("Reliance");
		oldCoreg.setDisplayText("Reliance Text");
		CoregMaster newCoreg = CoregMasterRepository.save(oldCoreg);
		return newCoreg;
	}
	@GetMapping(value="/api/findCoreg/{id}")
	public CoregMaster findOne(@PathVariable("id") Integer id)
	{
		CoregMaster coregMaster = CoregMasterRepository.findOne(id);
		if(null == coregMaster) {
			return null;
		}
		else{
			return coregMaster;
		}
	}
}
