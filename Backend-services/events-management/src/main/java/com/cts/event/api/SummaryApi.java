/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.cts.event.api;

import com.cts.event.model.EventSummary;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import reactor.core.publisher.Flux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

@Api(value = "summary", description = "the summary API")
public interface SummaryApi {

	Logger log = LoggerFactory.getLogger(SummaryApi.class);

	default Optional<ObjectMapper> getObjectMapper() {
		return Optional.empty();
	}

	default Optional<HttpServletRequest> getRequest() {
		return Optional.empty();
	}

	default Optional<String> getAcceptHeader() {
		return getRequest().map(r -> r.getHeader("Accept"));
	}

	@ApiOperation(value = "", nickname = "summaryAllGet", notes = "get the summary of all events", response = EventSummary.class, tags = {
			"Event Summary", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "fetch", response = EventSummary.class),
			@ApiResponse(code = 404, message = "No DataFound") })
	@RequestMapping(value = "/summary/all", produces = { "application/json" }, method = RequestMethod.GET)
	@CrossOrigin
	default Flux<EventSummary> summaryAllGet() {
		return Flux.just();
	}

	@PostMapping("/addSummaries")
	default Flux<ResponseEntity<EventSummary>> addEventSummaries(@RequestBody List<EventSummary> eventSummary) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getAcceptHeader().get().contains("application/json")) {
				try {
					return Flux.just(new ResponseEntity<>(getObjectMapper().get().readValue(
							"{  \"eventId\" : \"eventId\",  \"pocId\" : 7.061401241503109105224211816675961017608642578125,  \"pocContactnumber\" : 9.301444243932575517419536481611430644989013671875,  \"totalTravelHours\" : 1,  \"project\" : \"project\",  \"totalNoOfVolunteers\" : 0,  \"livesImpacted\" : 5,  \"councilName\" : \"councilName\",  \"month\" : \"month\",  \"totalVolunteerHours\" : 6,  \"pocName\" : \"pocName\",  \"baseLocation\" : \"baseLocation\",  \"beneficiaryName\" : \"beneficiaryName\",  \"eventDescription\" : \"eventDescription\",  \"eventName\" : \"eventName\",  \"summaryId\" : \"summaryId\",  \"category\" : \"category\",  \"activityType\" : 2,  \"venueAddress\" : \"venueAddress\",  \"OverallVolunteerHours\" : 5,  \"eventDate\" : \"2000-01-23\",  \"status\" : \"status\"}",
							EventSummary.class), HttpStatus.NOT_IMPLEMENTED));
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return Flux.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
				}
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default SummaryApi interface so no example is generated");
		}
		return Flux.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	}

}
