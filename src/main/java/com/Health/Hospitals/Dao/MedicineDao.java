package com.Health.Hospitals.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Medication;
import com.Health.Hospitals.Medicine;

@Repository
public interface MedicineDao extends JpaRepository<Medicine, Integer>{

}
