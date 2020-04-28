package com.cts.event.api;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.event.model.EventSummary;
import com.cts.event.repository.EventSummaryRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

import reactor.core.publisher.Mono;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

@Controller
public class SummaryIdApiController implements SummaryIdApi {

    private final ObjectMapper objectMapper;

	private final HttpServletRequest request;
    
    @Autowired
    EventSummaryRepository eventSummaryRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public SummaryIdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
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
    public Mono<ResponseEntity<EventSummary>> summaryIdSummaryIdGet(@PathVariable("summaryId") int summaryId){
    	Mono<EventSummary> eventSummary = eventSummaryRepository.findById(summaryId);
    	return eventSummary.map(info->ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<EventSummary>> updateSummary(@PathVariable int summaryId, @RequestBody EventSummary eventSummary) {
    	return eventSummaryRepository.findById(summaryId).flatMap(newSummary -> {
    		newSummary.setActivityType(eventSummary.getActivityType());
    		newSummary.setBaseLocation(eventSummary.getBaseLocation());
    		newSummary.setBeneficiaryName(eventSummary.getBeneficiaryName());
    		newSummary.setCategory(eventSummary.getCategory());
    		newSummary.setCouncilName(eventSummary.getCouncilName());
    		newSummary.setEventDate(eventSummary.getEventDate());
    		newSummary.setEventDescription(eventSummary.getEventDescription());
    		newSummary.setEventName(eventSummary.getEventName());
    		newSummary.setLivesImpacted(eventSummary.getLivesImpacted());
    		newSummary.setMonth(eventSummary.getMonth());
    		newSummary.setOverallVolunteerHours(eventSummary.getOverallVolunteerHours());
    		newSummary.setPocContactnumber(eventSummary.getPocContactnumber());
    		newSummary.setPocId(eventSummary.getPocId());
    		newSummary.setProject(eventSummary.getProject());
    		newSummary.setStatus(eventSummary.getStatus());
    		newSummary.setTotalNoOfVolunteers(eventSummary.getTotalNoOfVolunteers());
    		newSummary.setTotalTravelHours(eventSummary.getTotalTravelHours());
    		newSummary.setTotalVolunteerHours(eventSummary.getTotalVolunteerHours());
    		newSummary.setVenueAddress(eventSummary.getVenueAddress());
    		return eventSummaryRepository.save(newSummary);
    	}).map(info -> ResponseEntity.ok(info));
    }
    
    @Override
    public Mono<ResponseEntity<EventSummary>> addSummary(@RequestBody EventSummary eventSummary) {
    	return eventSummaryRepository.save(eventSummary).map(info -> ResponseEntity.ok(info));
    }

    @Override
    public Mono<ResponseEntity<EventSummary>> getReportByEventId(@PathVariable("eventId") String eventId){
    	return eventSummaryRepository.getReportById(eventId).map(info->ResponseEntity.ok(info));
    }


}
