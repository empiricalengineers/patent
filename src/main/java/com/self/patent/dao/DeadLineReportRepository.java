package com.self.patent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.self.patent.model.DeadlineReport;
import com.self.patent.model.Patent;

@Repository
public interface DeadLineReportRepository extends JpaRepository<DeadlineReport, Long>{
	
	/**
	 * Returns the patent records by applying the criteria
	 * @param currentdate
	 * @return
	 */
	@Query("select p from Patent p where status = 'Pending'  and\r\n" + 
			" datediff('hour',  current_timestamp, target_time)  <= 12")
	
	public List<Patent> makeReport();
}
