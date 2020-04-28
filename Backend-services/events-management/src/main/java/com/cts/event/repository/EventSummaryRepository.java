package com.cts.event.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.event.model.EventSummary;

import reactor.core.publisher.Mono;

@Repository
public interface EventSummaryRepository extends ReactiveCrudRepository<EventSummary, Integer> {

	@Query("SELECT SUM(total_no_of_volunteers) FROM event_summary")
	public Mono<Integer> getTotalVolunteers();

	@Query("SELECT SUM(lives_impacted) FROM event_summary")
	public Mono<Integer> getLivesImpacted();

	@Query("SELECT * FROM event_summary e WHERE e.event_id=:eventId")
	public Mono<EventSummary> getReportById(String eventId);
}
