package com.self.patent.service;

import java.util.List;

import com.self.patent.model.Patent;

public interface PatentServiceInterface {
	/**
	 * Returns all Patent Records
	 * 
	 */
	public List<Patent> getAll() ;
	
	
	/**
	 * Returns a Patent Record
	 * @param patentID
	 * @return
	 */
	public Patent get(Long patentID) ;
	
	
	/**
	 * Creates/Updates given Patent record
	 * @param patent
	 * @return
	 */
	public Patent save(Patent patent);
}
