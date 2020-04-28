package com.cts.event.repository;

import org.springframework.data.r2dbc.repository.query.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.event.model.Event;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface EventsRepository extends ReactiveCrudRepository<Event, Integer> {

	@Query("SELECT * FROM event e WHERE e.event_id=:eventId")
	public Mono<Event> getEventsById(String eventId);

	@Query("SELECT * FROM event e WHERE e.poc_id=:poc")
	public Flux<Event> getEventsByPoc(Integer poc);

	@Query("SELECT COUNT(event_id) FROM event")
	public Mono<Integer> getTotalEvents();

}
