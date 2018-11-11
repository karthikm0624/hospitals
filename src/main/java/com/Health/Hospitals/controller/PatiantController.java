package com.Health.Hospitals.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Patient;
import com.Health.Hospitals.Service.PatiantService;

@RestController
@RequestMapping("savepatiantlist")
@CrossOrigin
public class PatiantController {
	
	@Autowired
	public PatiantService ser;
@PostMapping
 public void setdata(@RequestBody Patient pl){
	ser.setdata(pl);
	}
@GetMapping("/{id}")
public Patient getpatiant(@PathVariable("id") Long id){
	Patient p=ser.getpatiant(id);
	return p;
	
}
	

}