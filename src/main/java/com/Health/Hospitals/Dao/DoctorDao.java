package com.Health.Hospitals.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Doctor;

@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long>{

}
