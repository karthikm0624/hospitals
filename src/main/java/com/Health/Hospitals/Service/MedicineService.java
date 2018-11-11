package com.Health.Hospitals.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Medicine;
import com.Health.Hospitals.Dao.MedicineDao;

@Service
public class MedicineService {
	@Autowired
	private MedicineDao ser;
	public void setdatamed(Medicine med){
		ser.save(med);
	}
	

}
/*@Service
public class PatiantService {
	@Autowired
private PatiantDao dao;
public void setdata(Patient p){
	p.setDate(new Date());
	dao.save(p);
}*/
