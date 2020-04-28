package com.cognizant.datamigration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.datamigration.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

	Event findByEventId(String eventId);
	
}
