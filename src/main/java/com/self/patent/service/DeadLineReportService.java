package com.self.patent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.patent.dao.DeadLineReportRepository;
import com.self.patent.model.DeadlineReport;
import com.self.patent.model.Patent;

@Service
public class DeadLineReportService implements DeadLineReportServiceInterface {
	@Autowired
	DeadLineReportRepository repository;

	@Override
	public List<DeadlineReport> getAll() {
		return repository.findAll();
	}
	
	@Override
	public List<DeadlineReport>  saveAll(List<DeadlineReport> reportRecords) {
		return repository.saveAll(reportRecords);
	}
	
	@Override
	public List<Patent>  makeReport() {
		return repository.makeReport();
	}

}
