package com.megan.abbiemagnawavebackend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "subscriptions")
public class Subscriptions {
	
	@Id
	private String id;
	
	private String clientId;
	private String adminId;
	
	private String type;
	private String appointmentType;
	
	private int sessionsPerCycle;
	private double pricePerCycle;
	private boolean isActive = true;
	
	private Date startDate;
	private Date nextBillingDate;
	
	private String paymentMethod;

	public Subscriptions() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	public int getSessionsPerCycle() {
		return sessionsPerCycle;
	}

	public void setSessionsPerCycle(int sessionsPerCycle) {
		this.sessionsPerCycle = sessionsPerCycle;
	}

	public double getPricePerCycle() {
		return pricePerCycle;
	}

	public void setPricePerCycle(double pricePerCycle) {
		this.pricePerCycle = pricePerCycle;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getNextBillingDate() {
		return nextBillingDate;
	}

	public void setNextBillingDate(Date nextBillingDate) {
		this.nextBillingDate = nextBillingDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
