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
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:22:38.996+05:30")

public class Event {
	@Id
	@JsonProperty("eventNo")
	private Integer eventNo = null;
	@JsonProperty("eventId")
	private String eventId = null;

	@JsonProperty("baseLocation")
	private String baseLocation = null;

	@JsonProperty("beneficiaryName")
	private String beneficiaryName = null;

	@JsonProperty("councilName")
	private String councilName = null;

	@JsonProperty("eventName")
	private String eventName = null;

	@JsonProperty("eventDescription")
	private String eventDescription = null;

	@JsonProperty("eventDate")
	private Date eventDate = null;

	@JsonProperty("employeeId")
	private BigDecimal employeeId = null;

	@JsonProperty("employeeName")
	private String employeeName = null;

	@JsonProperty("volunteerHours")
	private Integer volunteerHours = null;

	@JsonProperty("travelHours")
	private Integer travelHours = null;

	@JsonProperty("livesImpacted")
	private Integer livesImpacted = null;

	@JsonProperty("businessUnit")
	private String businessUnit = null;

	@JsonProperty("status")
	private String status = null;

	@JsonProperty("iiepCategory")
	private String iiepCategory = null;

	@JsonProperty("summaryId")
	private Integer summaryId = null;

	@JsonProperty("pocId")
	private Integer pocId = null;

	public Event eventId(String eventId) {
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

	public Integer getEventNo() {
		return eventNo;
	}

	public void setEventNo(Integer eventNo) {
		this.eventNo = eventNo;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Event baseLocation(String baseLocation) {
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

	public Event beneficiaryName(String beneficiaryName) {
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

	public Event councilName(String councilName) {
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

	public Event eventName(String eventName) {
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

	public Event eventDescription(String eventDescription) {
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

	public Event eventDate(Date eventDate) {
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

	public Event employeeId(BigDecimal employeeId) {
		this.employeeId = employeeId;
		return this;
	}

	/**
	 * Get employeeId
	 * 
	 * @return employeeId
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public BigDecimal getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(BigDecimal employeeId) {
		this.employeeId = employeeId;
	}

	public Event employeeName(String employeeName) {
		this.employeeName = employeeName;
		return this;
	}

	/**
	 * Get employeeName
	 * 
	 * @return employeeName
	 **/
	@ApiModelProperty(value = "")

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Event volunteerHours(Integer volunteerHours) {
		this.volunteerHours = volunteerHours;
		return this;
	}

	/**
	 * Get volunteerHours
	 * 
	 * @return volunteerHours
	 **/
	@ApiModelProperty(value = "")

	public Integer getVolunteerHours() {
		return volunteerHours;
	}

	public void setVolunteerHours(Integer volunteerHours) {
		this.volunteerHours = volunteerHours;
	}

	public Event travelHours(Integer travelHours) {
		this.travelHours = travelHours;
		return this;
	}

	/**
	 * Get travelHours
	 * 
	 * @return travelHours
	 **/
	@ApiModelProperty(value = "")

	public Integer getTravelHours() {
		return travelHours;
	}

	public void setTravelHours(Integer travelHours) {
		this.travelHours = travelHours;
	}

	public Event livesImpacted(Integer livesImpacted) {
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

	public Event businessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
		return this;
	}

	/**
	 * Get businessUnit
	 * 
	 * @return businessUnit
	 **/
	@ApiModelProperty(value = "")

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public Event status(String status) {
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

	public Event iiepCategory(String iiepCategory) {
		this.iiepCategory = iiepCategory;
		return this;
	}

	/**
	 * Get iiepCategory
	 * 
	 * @return iiepCategory
	 **/
	@ApiModelProperty(value = "")

	public String getIiepCategory() {
		return iiepCategory;
	}

	public void setIiepCategory(String iiepCategory) {
		this.iiepCategory = iiepCategory;
	}

	public Event summaryId(Integer summaryId) {
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

	public Integer getPoc() {
		return pocId;
	}

	public void setPoc(Integer poc) {
		this.pocId = poc;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Event event = (Event) o;
		return Objects.equals(this.eventId, event.eventId) && Objects.equals(this.baseLocation, event.baseLocation)
				&& Objects.equals(this.beneficiaryName, event.beneficiaryName)
				&& Objects.equals(this.councilName, event.councilName)
				&& Objects.equals(this.eventName, event.eventName)
				&& Objects.equals(this.eventDescription, event.eventDescription)
				&& Objects.equals(this.eventDate, event.eventDate) && Objects.equals(this.employeeId, event.employeeId)
				&& Objects.equals(this.employeeName, event.employeeName)
				&& Objects.equals(this.volunteerHours, event.volunteerHours)
				&& Objects.equals(this.travelHours, event.travelHours)
				&& Objects.equals(this.livesImpacted, event.livesImpacted)
				&& Objects.equals(this.businessUnit, event.businessUnit) && Objects.equals(this.status, event.status)
				&& Objects.equals(this.iiepCategory, event.iiepCategory)
				&& Objects.equals(this.summaryId, event.summaryId) && Objects.equals(this.pocId, event.pocId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventId, baseLocation, beneficiaryName, councilName, eventName, eventDescription, eventDate,
				employeeId, employeeName, volunteerHours, travelHours, livesImpacted, businessUnit, status,
				iiepCategory, summaryId, pocId);
	}

	@Override
	public String toString() {
		return "Event [eventNo=" + eventNo + ", eventId=" + eventId + ", baseLocation=" + baseLocation
				+ ", beneficiaryName=" + beneficiaryName + ", councilName=" + councilName + ", eventName=" + eventName
				+ ", eventDescription=" + eventDescription + ", eventDate=" + eventDate + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", volunteerHours=" + volunteerHours + ", travelHours="
				+ travelHours + ", livesImpacted=" + livesImpacted + ", businessUnit=" + businessUnit + ", status="
				+ status + ", iiepCategory=" + iiepCategory + ", summaryId=" + summaryId + ", pocId=" + pocId + "]";
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
