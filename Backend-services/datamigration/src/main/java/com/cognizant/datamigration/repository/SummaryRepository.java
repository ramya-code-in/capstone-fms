package com.cognizant.datamigration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.datamigration.model.Summary;

@Repository
public interface SummaryRepository extends JpaRepository<Summary, Integer> {

	Summary findByEventId(String eventId);
}
