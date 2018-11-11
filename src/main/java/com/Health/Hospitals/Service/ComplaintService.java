package com.Health.Hospitals.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Complaint;
import com.Health.Hospitals.Medication;
import com.Health.Hospitals.Dao.CompalintDao;


@Service
public class ComplaintService {
	@Autowired
	private CompalintDao d;
	public void setcomplaint(Complaint com){
		
List<Medication> med=		com.getMedication();
for (Medication medication : med) {
	medication.setComplaint(com);
}
		d.save(com);
	}
	public Complaint getcomplaint(Long id){
		Optional<Complaint> c=d.findById(id);
		Complaint com=c.get();
		return com;
		
	}
}
