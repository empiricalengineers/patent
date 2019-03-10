package com.self.patent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.self.patent.dao.PatentRepository;
import com.self.patent.model.Patent;

@Service
public class PatentService implements PatentServiceInterface {
	@Autowired
	PatentRepository repository;
	@Override
	public List<Patent> getAll() {
		return repository.findAll();
	}
	@Override
	public Patent get(Long patentID) {
		Patent patent=repository.findById(patentID).get();
		return patent;
	}
	@Override
	public Patent save(Patent patent) {
		return repository.save(patent);
	}

}
