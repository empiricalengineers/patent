package com.self.patent.qrtz;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.self.patent.model.DeadlineReport;
import com.self.patent.model.Patent;
import com.self.patent.service.DeadLineReportService;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class DeadLineReportJob extends QuartzJobBean {
	@Autowired
	DeadLineReportService deadLineReportService;
	protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
		
		List<Patent>  patentRecords=deadLineReportService.makeReport();
		
		//Preparing report records from patent records
		List<DeadlineReport> reports=new ArrayList<DeadlineReport>();
		for(Patent patent:patentRecords) {
			DeadlineReport report=new DeadlineReport();
			
			report.setDealineTime(patent.getTargetTime());
			report.setDocument(patent.getDocument());
			report.setPatent(patent);
			report.setReportTime(new Date());
			report.setStatus(patent.getStatus());
			reports.add(report);
		}
		
		deadLineReportService.saveAll(reports);
		
	}

}
