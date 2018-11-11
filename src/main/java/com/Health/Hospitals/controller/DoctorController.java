package com.Health.Hospitals.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Doctor;
import com.Health.Hospitals.Service.DoctorService;

@RestController
@RequestMapping("savedoctor")
public class DoctorController {
	@Autowired

/*public DoctorDao d;

public void setdata(@RequestBody List<Doctor> doc){
	for (Doctor doctor : doc) {
		d.save(doctor);
		
	}
}*/
	
	public DoctorService ser;
	@PostMapping
	public void setdoctor(@RequestBody Doctor doc){
		ser.setDoctor(doc);
	}
	@GetMapping("/{id}")
	public Doctor getdoctor(@PathVariable("id") Long id){
		Doctor doc=ser.getdoctor(id);
		return doc;
		
	}
}
