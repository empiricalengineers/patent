package com.self.patent.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.self.patent.model.Patent;

@Repository
public interface PatentRepository extends JpaRepository<Patent, Long>{

}
