package com.self.patent.service;

import java.util.List;

import com.self.patent.model.DeadlineReport;
import com.self.patent.model.Patent;
/**
 *  Returns DeadLine Report 
 *  Facilitates to create new DeadLine Report
 */
public interface DeadLineReportServiceInterface {
	/**
	 * Returns DeadLine Report
	 */
	public List<DeadlineReport> getAll();
	
	
	/**
	 * Creates DeadLine Report record 
	 * @param report - DeadlineReport data object
	 * @return
	 */
	public List<DeadlineReport>  saveAll(List<DeadlineReport> reportRecords);
	
	/**
	 * This method fetches data from Patent meeting report criteria
	 * @param report
	 * @return
	 */
	public List<Patent>  makeReport() ;
}
