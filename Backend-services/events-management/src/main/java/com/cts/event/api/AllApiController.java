package com.cts.event.api;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.event.model.Event;
import com.cts.event.repository.EventSummaryRepository;
import com.cts.event.repository.EventsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

@Controller
public class AllApiController implements AllApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	EventsRepository eventRepository;

	@Autowired
	EventSummaryRepository eventSummaryRepository;

	@org.springframework.beans.factory.annotation.Autowired
	public AllApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	@Override
	public Optional<ObjectMapper> getObjectMapper() {
		return Optional.ofNullable(objectMapper);
	}

	@Override
	public Optional<HttpServletRequest> getRequest() {
		return Optional.ofNullable(request);
	}

	@Override
	public Flux<Event> allGet(@PathVariable(name = "poc", required = false) Integer poc) {
		System.out.println("poc" + poc);
		if (poc == null) {
			Flux<Event> allEvents = this.eventRepository.findAll();
			return allEvents;
		} else {
			Flux<Event> allEvents = eventRepository.getEventsByPoc(poc);
			return allEvents;
		}
		// System.out.println(allEvents);
	}

	@Override
	public Flux<ResponseEntity<Event>> addEvents(@RequestBody List<Event> events) {
		return eventRepository.saveAll(events).map(info -> ResponseEntity.ok(info));
	}

	@Override
	public Flux<Integer> dashboard() {
		Mono<Integer> totalEvents = eventRepository.getTotalEvents();
		Mono<Integer> livesImpacted = eventSummaryRepository.getLivesImpacted();
		Mono<Integer> totalVolunteers = eventSummaryRepository.getTotalVolunteers();
		System.out.println(totalEvents);
		System.out.println(livesImpacted);
		System.out.println(totalVolunteers);
		return Flux.concat(totalEvents).concatWith(livesImpacted).concatWith(totalVolunteers);
	}

}
