package com.Health.Hospitals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Complaint;
import com.Health.Hospitals.Service.ComplaintService;

@RestController
@RequestMapping("complaint")
public class CompalintController {
	@Autowired
	public ComplaintService ser;
	@PostMapping
	public void setcomplaint(@RequestBody Complaint com){
		
		ser.setcomplaint(com);
	}
	@GetMapping("/{id}")
	public Complaint getcomplaint(@PathVariable("id") Long id){
		Complaint com=ser.getcomplaint(id);
		return com;
		
	}

}
