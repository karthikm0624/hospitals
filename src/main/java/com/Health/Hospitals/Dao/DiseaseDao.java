package com.Health.Hospitals.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Integer>{

}
