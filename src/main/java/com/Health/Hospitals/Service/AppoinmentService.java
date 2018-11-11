package com.Health.Hospitals.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Appointment;
import com.Health.Hospitals.Dao.AppoinmentDao;

@Service
public class AppoinmentService {
	@Autowired
	private AppoinmentDao dao;

	public void setappoinment(List<Appointment> app){
		
			dao.saveAll(app);
		
		
	}

}
