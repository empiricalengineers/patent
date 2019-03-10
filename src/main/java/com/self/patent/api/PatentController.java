package com.self.patent.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.patent.model.Patent;
import com.self.patent.service.PatentService;

/**
 * 
 * Returns all Patents
 * Returns a Patent provided by ID
 * Updates a Patent with specified data
 */

@RestController
@RequestMapping("/patents")
public class PatentController {
  
	@Autowired
	PatentService patentService;
	@GetMapping("")
	/**
	 * Returns all Patents
	 * @return
	 */
	 public List<Patent> patents() {
		 return patentService.getAll();
	 }
	
	/**
	 * Returns Patent 
	 * @param patentID
	 * @return
	 */
	 @GetMapping("/patent/{id}")
	 public Patent patent(@PathVariable(name="id") Long patentID) {
		 return patentService.get(patentID);
	 }
	 
	 
	 /**
	  * Updates Patent 
	  * @param patent
	  * @return
	  */
	 @PutMapping("/patent")
	 public Patent patent(@RequestBody Patent patent) {
		 return patentService.save(patent);
	 }
	 
}
