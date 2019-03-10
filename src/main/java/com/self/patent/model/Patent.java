package com.self.patent.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Patent {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long patentId;
	@ManyToOne(targetEntity=Author.class)
	private Author author;
	@OneToOne(targetEntity=Document.class)
	private Document document;
	private String status;
	private Date createTime;
	private Date targetTime;
	public Long getPatentId() {
		return patentId;
	}
	public void setPatentId(Long patentId) {
		this.patentId = patentId;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getTargetTime() {
		return targetTime;
	}
	public void setTargetTime(Date targetTime) {
		this.targetTime = targetTime;
	}
	
		
}
