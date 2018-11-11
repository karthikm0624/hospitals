package com.Health.Hospitals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Visiting;
import com.Health.Hospitals.Service.VisitService;

@RestController
@RequestMapping("visitor")
public class VisitController {
	@Autowired
	public VisitService ser;
	@PostMapping
	public void setvisitdata(@RequestBody Visiting vst){
		ser.setvisit(vst);
	}
	

}
