package com.Health.Hospitals.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Visiting;
import com.Health.Hospitals.Dao.VisiDao;

@Service
public class VisitService {
	@Autowired
	private VisiDao d;
	public void setvisit(Visiting vst){
		vst.setDateTime(new Date());
		d.save(vst);
	}

}
