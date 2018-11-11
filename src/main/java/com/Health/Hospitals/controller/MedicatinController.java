package com.Health.Hospitals.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Health.Hospitals.Service.MedicationService;

@RestController
@RequestMapping("mdication")
public class MedicatinController {
	@Autowired
public MedicationService serv;
	@GetMapping("/{name}")
	public List<Object[]> getallBydet(@PathVariable("name") String name){
		return serv.getalldetails(name);
		
	}
	@GetMapping("byName/{namee}")
	public List<Object[]> getpatientdetailsByname(@PathVariable("namee") String name){
		return serv.getdoctorBydetails(name);
		
	}
	@GetMapping("bydate/{fdate}/{ldate}")
	public List<Object[]> getdateByall(@PathVariable ("fdate") @DateTimeFormat(pattern="yyyy-MM-dd")  Date  firstdate,
			@PathVariable("ldate") @DateTimeFormat(pattern="yyyy-MM-dd")  Date lastdate){
				return serv.getedateByname(firstdate, lastdate);
		
	}
}
