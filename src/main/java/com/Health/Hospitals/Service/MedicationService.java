package com.Health.Hospitals.Service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Dao.MedicationDao;

@Service
public class MedicationService {
	@Autowired
private  MedicationDao d;
public List<Object[]> getalldetails(String name){
	return d.getallBypatient(name);
	
}
public List<Object[]> getdoctorBydetails(String name){
	return d.getpatientdetailsByname(name);
	
}
public List<Object[]> getedateByname(Date fdate , Date ldate){
	return d.getdateBybetween(fdate, ldate);
	
}
}
