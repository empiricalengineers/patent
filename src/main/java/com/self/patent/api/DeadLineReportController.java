package com.self.patent.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.patent.model.DeadlineReport;
import com.self.patent.service.DeadLineReportService;

/**
 * 
 * Returns all Patents
 * Returns a Patent provided by ID
 * Updates a Patent with specified data
 */

@RestController
@RequestMapping("/deadline-report")
public class DeadLineReportController {
  
	/**
	 * Gets all the deadline records
	 */
	@Autowired
	DeadLineReportService deadLineReportService;
	@GetMapping("")
	 public List<DeadlineReport> pull() {
		 return deadLineReportService.getAll();
	 }
	
}
