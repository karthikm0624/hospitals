package com.Health.Hospitals.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Health.Hospitals.Medication;

@Repository
public interface MedicationDao extends JpaRepository<Medication, Long> {
	@Query("select dc.name,ap.dateTime from Medication md"
			+ " join md.medicne mc  "
			+ " join md.complaint cm  "
			+ " join cm.disease ds "
			+ " join cm.visiting v "
			+ " join v.appointment ap "
			+ " join ap.patient p "
			+ " join v.doctor dc "
			+ " where mc.name=?1 ")
	public List<Object[]> getallBypatient(String name);
//===================================================
	@Query(" select dc.name, dc.spec from Medication md "
			+ "join md.medicne mc"
			+ " join md.complaint cm "
			+ " join cm.disease ds "
			+ " join cm.visiting v"
			+ " join v.appointment ap"
			+ " join v.doctor dc "
			+ " join  ap.patient p "
			+ "  where p.name=?1 ")
	public List<Object[]> getpatientdetailsByname(String name);
	//=======================================================
	@Query("select p.name,p.phone from Medication md "
			+ " join md.medicne mc "
			+ " join md.complaint cm "
			+ " join cm.disease ds "
			+ " join cm.visiting v "
			+ " join v.appointment ap "
			+ " join v.doctor dc "
			+ " join ap.patient p "
			+ "where ap.dateTime between ?1 and ?2")
	public List<Object[]> getdateBybetween(Date fdate, Date ldate );
}
