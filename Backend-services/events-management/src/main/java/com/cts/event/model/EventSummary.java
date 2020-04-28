package com.cts.event.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * EventSummary
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

public class EventSummary {
	@Id
	@JsonProperty("summaryId")
	private Integer summaryId = null;

	@JsonProperty("eventId")
	private String eventId = null;

	@JsonProperty("month")
	private String month = null;

	@JsonProperty("baseLocation")
	private String baseLocation = null;

	@JsonProperty("beneficiaryName")
	private String beneficiaryName = null;

	@JsonProperty("venueAddress")
	private String venueAddress = null;

	@JsonProperty("councilName")
	private String councilName = null;

	@JsonProperty("project")
	private String project = null;

	@JsonProperty("category")
	private String category = null;

	@JsonProperty("eventName")
	private String eventName = null;

	@JsonProperty("eventDescription")
	private String eventDescription = null;

	@JsonProperty("eventDate")
	private Date eventDate = null;

	@JsonProperty("totalNoOfVolunteers")
	private Integer totalNoOfVolunteers = null;

	@JsonProperty("totalVolunteerHours")
	private Integer totalVolunteerHours = null;

	@JsonProperty("totalTravelHours")
	private Integer totalTravelHours = null;

	@JsonProperty("OverallVolunteerHours")
	private Integer overallVolunteerHours = null;

	@JsonProperty("livesImpacted")
	private Integer livesImpacted = null;

	@JsonProperty("activityType")
	private String activityType = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("pocId")
	private BigDecimal pocId = null;

	@JsonProperty("pocName")
	private String pocName = null;

	@JsonProperty("pocContactnumber")
	private BigDecimal pocContactnumber = null;

	public EventSummary summaryId(int summaryId) {
		this.summaryId = summaryId;
		return this;
	}

	/**
	 * Get summaryId
	 * 
	 * @return summaryId
	 **/
	@ApiModelProperty(value = "")

	public Integer getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}

	public EventSummary eventId(String eventId) {
		this.eventId = eventId;
		return this;
	}

	/**
	 * Get eventId
	 * 
	 * @return eventId
	 **/
	@ApiModelProperty(value = "")

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public EventSummary month(String month) {
		this.month = month;
		return this;
	}

	/**
	 * Get month
	 * 
	 * @return month
	 **/
	@ApiModelProperty(value = "")

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public EventSummary baseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
		return this;
	}

	/**
	 * Get baseLocation
	 * 
	 * @return baseLocation
	 **/
	@ApiModelProperty(value = "")

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public EventSummary beneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
		return this;
	}

	/**
	 * Get beneficiaryName
	 * 
	 * @return beneficiaryName
	 **/
	@ApiModelProperty(value = "")

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public EventSummary venueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
		return this;
	}

	/**
	 * Get venueAddress
	 * 
	 * @return venueAddress
	 **/
	@ApiModelProperty(value = "")

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public EventSummary councilName(String councilName) {
		this.councilName = councilName;
		return this;
	}

	/**
	 * Get councilName
	 * 
	 * @return councilName
	 **/
	@ApiModelProperty(value = "")

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public EventSummary project(String project) {
		this.project = project;
		return this;
	}

	/**
	 * Get project
	 * 
	 * @return project
	 **/
	@ApiModelProperty(value = "")

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public EventSummary category(String category) {
		this.category = category;
		return this;
	}

	/**
	 * Get category
	 * 
	 * @return category
	 **/
	@ApiModelProperty(value = "")

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public EventSummary eventName(String eventName) {
		this.eventName = eventName;
		return this;
	}

	/**
	 * Get eventName
	 * 
	 * @return eventName
	 **/
	@ApiModelProperty(value = "")

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public EventSummary eventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
		return this;
	}

	/**
	 * Get eventDescription
	 * 
	 * @return eventDescription
	 **/
	@ApiModelProperty(value = "")

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public EventSummary eventDate(Date eventDate) {
		this.eventDate = eventDate;
		return this;
	}

	/**
	 * Get eventDate
	 * 
	 * @return eventDate
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public EventSummary totalNoOfVolunteers(Integer totalNoOfVolunteers) {
		this.totalNoOfVolunteers = totalNoOfVolunteers;
		return this;
	}

	/**
	 * Get totalNoOfVolunteers
	 * 
	 * @return totalNoOfVolunteers
	 **/
	@ApiModelProperty(value = "")

	public Integer getTotalNoOfVolunteers() {
		return totalNoOfVolunteers;
	}

	public void setTotalNoOfVolunteers(Integer totalNoOfVolunteers) {
		this.totalNoOfVolunteers = totalNoOfVolunteers;
	}

	public EventSummary totalVolunteerHours(Integer totalVolunteerHours) {
		this.totalVolunteerHours = totalVolunteerHours;
		return this;
	}

	/**
	 * Get totalVolunteerHours
	 * 
	 * @return totalVolunteerHours
	 **/
	@ApiModelProperty(value = "")

	public Integer getTotalVolunteerHours() {
		return totalVolunteerHours;
	}

	public void setTotalVolunteerHours(Integer totalVolunteerHours) {
		this.totalVolunteerHours = totalVolunteerHours;
	}

	public EventSummary totalTravelHours(Integer totalTravelHours) {
		this.totalTravelHours = totalTravelHours;
		return this;
	}

	/**
	 * Get totalTravelHours
	 * 
	 * @return totalTravelHours
	 **/
	@ApiModelProperty(value = "")

	public Integer getTotalTravelHours() {
		return totalTravelHours;
	}

	public void setTotalTravelHours(Integer totalTravelHours) {
		this.totalTravelHours = totalTravelHours;
	}

	public EventSummary overallVolunteerHours(Integer overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
		return this;
	}

	/**
	 * Get overallVolunteerHours
	 * 
	 * @return overallVolunteerHours
	 **/
	@ApiModelProperty(value = "")

	public Integer getOverallVolunteerHours() {
		return overallVolunteerHours;
	}

	public void setOverallVolunteerHours(Integer overallVolunteerHours) {
		this.overallVolunteerHours = overallVolunteerHours;
	}

	public EventSummary livesImpacted(Integer livesImpacted) {
		this.livesImpacted = livesImpacted;
		return this;
	}

	/**
	 * Get livesImpacted
	 * 
	 * @return livesImpacted
	 **/
	@ApiModelProperty(value = "")

	public Integer getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(Integer livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public EventSummary activityType(String activityType) {
		this.activityType = activityType;
		return this;
	}

	/**
	 * Get activityType
	 * 
	 * @return activityType
	 **/
	@ApiModelProperty(value = "")

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public EventSummary status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public EventSummary pocId(BigDecimal pocId) {
		this.pocId = pocId;
		return this;
	}

	/**
	 * Get pocId
	 * 
	 * @return pocId
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getPocId() {
		return pocId;
	}

	public void setPocId(BigDecimal pocId) {
		this.pocId = pocId;
	}

	public EventSummary pocName(String pocName) {
		this.pocName = pocName;
		return this;
	}

	/**
	 * Get pocName
	 * 
	 * @return pocName
	 **/
	@ApiModelProperty(value = "")

	public String getPocName() {
		return pocName;
	}

	public void setPocName(String pocName) {
		this.pocName = pocName;
	}

	public EventSummary pocContactnumber(BigDecimal pocContactnumber) {
		this.pocContactnumber = pocContactnumber;
		return this;
	}

	/**
	 * Get pocContactnumber
	 * 
	 * @return pocContactnumber
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getPocContactnumber() {
		return pocContactnumber;
	}

	public void setPocContactnumber(BigDecimal pocContactnumber) {
		this.pocContactnumber = pocContactnumber;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EventSummary eventSummary = (EventSummary) o;
		return Objects.equals(this.summaryId, eventSummary.summaryId)
				&& Objects.equals(this.eventId, eventSummary.eventId) && Objects.equals(this.month, eventSummary.month)
				&& Objects.equals(this.baseLocation, eventSummary.baseLocation)
				&& Objects.equals(this.beneficiaryName, eventSummary.beneficiaryName)
				&& Objects.equals(this.venueAddress, eventSummary.venueAddress)
				&& Objects.equals(this.councilName, eventSummary.councilName)
				&& Objects.equals(this.project, eventSummary.project)
				&& Objects.equals(this.category, eventSummary.category)
				&& Objects.equals(this.eventName, eventSummary.eventName)
				&& Objects.equals(this.eventDescription, eventSummary.eventDescription)
				&& Objects.equals(this.eventDate, eventSummary.eventDate)
				&& Objects.equals(this.totalNoOfVolunteers, eventSummary.totalNoOfVolunteers)
				&& Objects.equals(this.totalVolunteerHours, eventSummary.totalVolunteerHours)
				&& Objects.equals(this.totalTravelHours, eventSummary.totalTravelHours)
				&& Objects.equals(this.overallVolunteerHours, eventSummary.overallVolunteerHours)
				&& Objects.equals(this.livesImpacted, eventSummary.livesImpacted)
				&& Objects.equals(this.activityType, eventSummary.activityType)
				&& Objects.equals(this.status, eventSummary.status) && Objects.equals(this.pocId, eventSummary.pocId)
				&& Objects.equals(this.pocName, eventSummary.pocName)
				&& Objects.equals(this.pocContactnumber, eventSummary.pocContactnumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(summaryId, eventId, month, baseLocation, beneficiaryName, venueAddress, councilName,
				project, category, eventName, eventDescription, eventDate, totalNoOfVolunteers, totalVolunteerHours,
				totalTravelHours, overallVolunteerHours, livesImpacted, activityType, status, pocId, pocName,
				pocContactnumber);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EventSummary {\n");

		sb.append("    summaryId: ").append(toIndentedString(summaryId)).append("\n");
		sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
		sb.append("    month: ").append(toIndentedString(month)).append("\n");
		sb.append("    baseLocation: ").append(toIndentedString(baseLocation)).append("\n");
		sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
		sb.append("    venueAddress: ").append(toIndentedString(venueAddress)).append("\n");
		sb.append("    councilName: ").append(toIndentedString(councilName)).append("\n");
		sb.append("    project: ").append(toIndentedString(project)).append("\n");
		sb.append("    category: ").append(toIndentedString(category)).append("\n");
		sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
		sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
		sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
		sb.append("    totalNoOfVolunteers: ").append(toIndentedString(totalNoOfVolunteers)).append("\n");
		sb.append("    totalVolunteerHours: ").append(toIndentedString(totalVolunteerHours)).append("\n");
		sb.append("    totalTravelHours: ").append(toIndentedString(totalTravelHours)).append("\n");
		sb.append("    overallVolunteerHours: ").append(toIndentedString(overallVolunteerHours)).append("\n");
		sb.append("    livesImpacted: ").append(toIndentedString(livesImpacted)).append("\n");
		sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    pocId: ").append(toIndentedString(pocId)).append("\n");
		sb.append("    pocName: ").append(toIndentedString(pocName)).append("\n");
		sb.append("    pocContactnumber: ").append(toIndentedString(pocContactnumber)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
