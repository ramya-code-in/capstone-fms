package com.cts.event.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.event.model.Event;
import com.cts.event.repository.EventsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

@Controller
public class EventidApiController implements EventidApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	EventsRepository eventRepository;

	@org.springframework.beans.factory.annotation.Autowired
	public EventidApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
	public Mono<Event> eventidEventIdGet(@PathVariable("eventId") int eventId) {
		Mono<Event> event = eventRepository.findById(eventId);
		// System.out.println("data "+ eventRepository.findById(eventId));
		return event;

	}

	@Override
	public Mono<ResponseEntity<Event>> addEvent(@RequestBody Event event) {
		return eventRepository.save(event).map(info -> ResponseEntity.ok(info));
	}

	@Override
	public Mono<ResponseEntity<Event>> updateEvent(@RequestBody Event event, @PathVariable("eventId") String eventId) {
		return eventRepository.getEventsById(event.getEventId()).flatMap(newEvent -> {
			newEvent.setEventName(event.getEventName());
			newEvent.setBaseLocation(event.getBaseLocation());
			newEvent.setBeneficiaryName(event.getBeneficiaryName());
			newEvent.setBusinessUnit(event.getBusinessUnit());
			newEvent.setCouncilName(event.getCouncilName());
			newEvent.setEmployeeId(event.getEmployeeId());
			newEvent.setEventDate(event.getEventDate());
			newEvent.setEventDescription(event.getEventDescription());
			newEvent.setEmployeeName(event.getEmployeeName());
			newEvent.setIiepCategory(event.getIiepCategory());
			newEvent.setLivesImpacted(event.getLivesImpacted());
			newEvent.setStatus(event.getStatus());
			newEvent.setSummaryId(event.getSummaryId());
			newEvent.setVolunteerHours(event.getVolunteerHours());
			newEvent.setTravelHours(event.getTravelHours());
			// dbUser.setSalary(user.getSalary());
			return eventRepository.save(newEvent);
		}).map(updatedUser -> ResponseEntity.ok(updatedUser));
		// .defaultIfEmpty(ResponseEntity.badRequest().build());
	}

	@Override
	public Mono<ResponseEntity<Event>> findById(@PathVariable("id") int id) {
		return eventRepository.findById(id).map(info -> ResponseEntity.ok(info));
	}
}
