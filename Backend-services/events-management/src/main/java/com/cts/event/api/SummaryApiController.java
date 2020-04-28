package com.cts.event.api;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.event.model.EventSummary;
import com.cts.event.repository.EventSummaryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

@Controller
public class SummaryApiController implements SummaryApi {

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@Autowired
	EventSummaryRepository eventSummaryRepository;

	@org.springframework.beans.factory.annotation.Autowired
	public SummaryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
	public Flux<EventSummary> summaryAllGet() {
		Flux<EventSummary> allSummary = eventSummaryRepository.findAll();
		return allSummary;

	}

	@Override
	public Flux<ResponseEntity<EventSummary>> addEventSummaries(@RequestBody List<EventSummary> eventSummary) {
		return eventSummaryRepository.saveAll(eventSummary).map(summaryList -> ResponseEntity.ok(summaryList));
	}
}
