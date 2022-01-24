package com.ncert.entities;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "master_scheduler_config")
public class MasterScheduler {
	
	@Id
	@Column(name = "scheduler_id")
	private int schedulerId;
	@Column(name = "start_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	@Column(name = "end_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	@Column(name = "start_time")
	private String startTime;
	@Column(name = "failure_start_time")
	private String failureStartTime;
	@Column(name = "notification_frequency")
	private int notificationFrequency;
	@Column(name = "delta_days")
	private int deltaDays;
	@Column(name = "mail_to")
	private String mailTo;
	@Column(name = "mail_cc")
	private String mailCc;
	
	//@Temporal(TemporalType.DATE)
	@Column(name = "created_time")
	private Timestamp createdTime;
	//@Temporal(TemporalType.DATE)
	@Column(name = "modified_time")
	private Timestamp modifiedTime;
	@Column(name = "created_by")
	private String createdBy;
	@Column(name = "modified_by")
	private String modifiedBy;
	public int getSchedulerId() {
		return schedulerId;
	}
	public void setSchedulerId(int schedulerId) {
		this.schedulerId = schedulerId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getFailureStartTime() {
		return failureStartTime;
	}
	public void setFailureStartTime(String failureStartTime) {
		this.failureStartTime = failureStartTime;
	}
	public int getNotificationFrequency() {
		return notificationFrequency;
	}
	public void setNotificationFrequency(int notificationFrequency) {
		this.notificationFrequency = notificationFrequency;
	}
	public int getDeltaDays() {
		return deltaDays;
	}
	public void setDeltaDays(int deltaDays) {
		this.deltaDays = deltaDays;
	}
	public String getMailTo() {
		return mailTo;
	}
	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}
	public String getMailCc() {
		return mailCc;
	}
	public void setMailCc(String mailCc) {
		this.mailCc = mailCc;
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
	
	
	
}
