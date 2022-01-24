package com.ncert.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(SurveyorRespondentPrimary.class)
@Table(name = "sr_surveyor_respondent_details")
public class SurveyorRespondent {
	
	@Id
	@Column(name = "respdt_details_id")
	private int respdtDetailsId;		
	@Column(name = "user_id")
	private String userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "respondent_type")
	private String respondentType;
	@Column(name = "url")
	private String url;
	@Id
	@Column(name = "state_id")
	private int stateId;
	@Column(name = "created_time")
	private Timestamp createdTime;
	@Column(name = "modified_time")
	private Timestamp modifiedTime;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "modified_by")
	private String modifiedBy;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "is_survey_submitted")
	private int isSurveySubmitted;
	@Column(name = "status")
	private int status;
	@Column(name = "surveyor_mobile_number")
	private String surveyorMobileNumber;
	@Column(name = "respondent_mobile_number")
	private String respondentMobileNumber;
	@Column(name = "reminder_count")
	private int reminderCount;
	@Column(name = "reminder_failure_time")
	private Timestamp reminderFailureTime;

	public int getRespdtDetailsId() {
		return respdtDetailsId;
	}

	public void setRespdtDetailsId(int respdtDetailsId) {
		this.respdtDetailsId = respdtDetailsId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRespondentType() {
		return respondentType;
	}

	public void setRespondentType(String respondentType) {
		this.respondentType = respondentType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getIsSurveySubmitted() {
		return isSurveySubmitted;
	}

	public void setIsSurveySubmitted(int isSurveySubmitted) {
		this.isSurveySubmitted = isSurveySubmitted;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSurveyorMobileNumber() {
		return surveyorMobileNumber;
	}

	public void setSurveyorMobileNumber(String surveyorMobileNumber) {
		this.surveyorMobileNumber = surveyorMobileNumber;
	}

	public String getRespondentMobileNumber() {
		return respondentMobileNumber;
	}

	public void setRespondentMobileNumber(String respondentMobileNumber) {
		this.respondentMobileNumber = respondentMobileNumber;
	}

	public int getReminderCount() {
		return reminderCount;
	}

	public void setReminderCount(int reminderCount) {
		this.reminderCount = reminderCount;
	}

	public Timestamp getReminderFailureTime() {
		return reminderFailureTime;
	}

	public void setReminderFailureTime(Timestamp reminderFailureTime) {
		this.reminderFailureTime = reminderFailureTime;
	}
}
