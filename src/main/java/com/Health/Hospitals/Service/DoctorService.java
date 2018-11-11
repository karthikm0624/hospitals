package com.Health.Hospitals.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Doctor;
import com.Health.Hospitals.Dao.DoctorDao;

@Service
public class DoctorService {
	@Autowired
	private DoctorDao d;
	public void setDoctor(Doctor doc){
		d.save(doc);
	}
public Doctor getdoctor(Long id){
	Optional<Doctor> dd=d.findById(id);
	Doctor doc=dd.get();
	return doc;
	
}
}
