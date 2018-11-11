package com.Health.Hospitals.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Health.Hospitals.Disease;
import com.Health.Hospitals.Dao.DiseaseDao;

@Service
public class DiseaseService {
@Autowired
private DiseaseDao dao;
public void setDisease(Disease ds){
	dao.save(ds);
}
}
