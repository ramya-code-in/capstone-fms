package com.cognizant.datamigration.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Event {

	@Id
	@GeneratedValue
	private int eventNo;
	private String eventId;
	private String baseLocation;
	private String beneficiaryName;
	private String councilName;
	private String eventName;
	private String eventDescription;
	private String eventDate;
	private String employeeId;
	private String employeeName;
	private String volunteerHours;
	private String travelHours;
	private String livesImpacted;
	private String businessUnit;
	private String status;
	private String iiepCategory;
	private String summaryId;
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(int eventNo, String eventId, String baseLocation, String beneficiaryName, String councilName,
			String eventName, String eventDescription, String eventDate, String employeeId, String employeeName,
			String volunteerHours, String travelHours, String livesImpacted, String businessUnit, String status,
			String iiepCategory, String summaryId) {
		super();
		this.eventNo = eventNo;
		this.eventId = eventId;
		this.baseLocation = baseLocation;
		this.beneficiaryName = beneficiaryName;
		this.councilName = councilName;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.volunteerHours = volunteerHours;
		this.travelHours = travelHours;
		this.livesImpacted = livesImpacted;
		this.businessUnit = businessUnit;
		this.status = status;
		this.iiepCategory = iiepCategory;
		this.summaryId = summaryId;
	}

	public int getEventNo() {
		return eventNo;
	}

	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getBaseLocation() {
		return baseLocation;
	}

	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public String getCouncilName() {
		return councilName;
	}

	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getemployeeId() {
		return employeeId;
	}

	public void setemployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getVolunteerHours() {
		return volunteerHours;
	}

	public void setVolunteerHours(String volunteerHours) {
		this.volunteerHours = volunteerHours;
	}

	public String getTravelHours() {
		return travelHours;
	}

	public void setTravelHours(String travelHours) {
		this.travelHours = travelHours;
	}

	public String getLivesImpacted() {
		return livesImpacted;
	}

	public void setLivesImpacted(String livesImpacted) {
		this.livesImpacted = livesImpacted;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIiepCategory() {
		return iiepCategory;
	}

	public void setIiepCategory(String iiepCategory) {
		this.iiepCategory = iiepCategory;
	}

	public String getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}

	@Override
	public String toString() {
		return "Event [eventNo=" + eventNo + ", eventId=" + eventId + ", baseLocation=" + baseLocation
				+ ", beneficiaryName=" + beneficiaryName + ", councilName=" + councilName + ", eventName=" + eventName
				+ ", eventDescription=" + eventDescription + ", eventDate=" + eventDate + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", volunteerHours=" + volunteerHours + ", travelHours=" + travelHours
				+ ", livesImpacted=" + livesImpacted + ", businessUnit=" + businessUnit + ", status=" + status
				+ ", iiepCategory=" + iiepCategory + ", summaryId=" + summaryId + "]";
	}

	
	
}
