package com.ncert.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "notification_gateway_status")
public class NotificationGateway {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "email_status")
	private Boolean emailStatus;
	@Column(name = "sms_status")
	private Boolean smsStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Boolean getEmailStatus() {
		return emailStatus;
	}
	public void setEmailStatus(Boolean emailStatus) {
		this.emailStatus = emailStatus;
	}
	public Boolean getSmsStatus() {
		return smsStatus;
	}
	public void setSmsStatus(Boolean smsStatus) {
		this.smsStatus = smsStatus;
	}
	

}
