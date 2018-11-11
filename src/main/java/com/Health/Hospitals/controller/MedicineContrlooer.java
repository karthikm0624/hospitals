package com.Health.Hospitals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Medicine;
import com.Health.Hospitals.Service.MedicineService;

@RestController
@RequestMapping("all")
public class MedicineContrlooer {
	@Autowired
	public MedicineService ser;
@PostMapping
	public void setmeddate(@RequestBody Medicine med){
		ser.setdatamed(med);
	}

}
