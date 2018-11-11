package com.Health.Hospitals.Service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Patient;
import com.Health.Hospitals.Dao.PatiantDao;


@Service
public class PatiantService {
	@Autowired
private PatiantDao dao;
public void setdata(Patient p){
	p.setDate(new Date());
	dao.save(p);
}
public Patient getpatiant(Long  id){
	Optional<Patient> p=dao.findById(id);
	Patient pp=p.get();
	return pp;
	
}

}
