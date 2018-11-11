package com.Health.Hospitals.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Disease;
import com.Health.Hospitals.Service.DiseaseService;

@RestController
@RequestMapping("setdisease")
public class DiseaseController {
	/*@Autowired
	public DiseaseDao d;
	@RequestMapping("setdisese")
 public void setdata(@RequestBody List<Disease> ds){
		d.saveAll(ds);
	}*/
	@Autowired
	public DiseaseService ser;
	@PostMapping
	public void setdisease(@RequestBody Disease ds){
		ser.setDisease(ds);
	}
	
}
