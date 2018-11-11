package com.Health.Hospitals.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Visiting;

@Repository
public interface VisiDao extends JpaRepository<Visiting, Integer> {
	

}
