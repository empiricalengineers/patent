package com.self.patent.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DeadlineReport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long deadlineReportId;
	@ManyToOne(targetEntity=Patent.class)
	private Patent patent;
	@ManyToOne(targetEntity=Document.class)
	private Document document;
	private Date reportTime;
	private Date dealineTime;
	private String status;

	public Long getDeadlineReportId() {
		return deadlineReportId;
	}


	public void setDeadlineReportId(Long deadlineReportId) {
		this.deadlineReportId = deadlineReportId;
	}


	public Patent getPatent() {
		return patent;
	}


	public void setPatent(Patent patent) {
		this.patent = patent;
	}


	public Document getDocument() {
		return document;
	}


	public void setDocument(Document doc) {
		this.document = doc;
	}


	public Date getReportTime() {
		return reportTime;
	}


	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}


	public Date getDealineTime() {
		return dealineTime;
	}


	public void setDealineTime(Date dealineTime) {
		this.dealineTime = dealineTime;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
