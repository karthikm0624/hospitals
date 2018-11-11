package com.Health.Hospitals.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Complaint;

@Repository
public interface CompalintDao extends JpaRepository<Complaint, Long>{

}
