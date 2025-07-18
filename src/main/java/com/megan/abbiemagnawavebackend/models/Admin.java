package com.megan.abbiemagnawavebackend.models;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Document(collection = "admin")
public class Admin {
	
	@Id
	private String id;

	private String firstName;

	private String lastname;

	 private String email;

	private String password;
	
	private String confirm;
	
	private String SafetyPin;
	
	private String preferredPayoutMethod; // e.g., "cashapp", "paypal"
	
	private String paypalEmail;
	private String cashAppTag;
	private String venmoHandle;
	private String zelleEmail;
	
    private String Location;
    
    private double Latitude;
    
    private double Longitude;
    
    private boolean isActive = true;
    
    private Date createdAt = new Date();
    
    private String phoneNumber;
    
    private String profileImageUrl;
    
    private String instagramUrl;
    
    private String facebookUrl;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}

	public String getSafetyPin() {
		return SafetyPin;
	}

	public void setSafetyPin(String safetyPin) {
		SafetyPin = safetyPin;
	}

	public String getPreferredPayoutMethod() {
		return preferredPayoutMethod;
	}

	public void setPreferredPayoutMethod(String preferredPayoutMethod) {
		this.preferredPayoutMethod = preferredPayoutMethod;
	}

	public String getPaypalEmail() {
		return paypalEmail;
	}

	public void setPaypalEmail(String paypalEmail) {
		this.paypalEmail = paypalEmail;
	}

	public String getCashAppTag() {
		return cashAppTag;
	}

	public void setCashAppTag(String cashAppTag) {
		this.cashAppTag = cashAppTag;
	}

	public String getVenmoHandle() {
		return venmoHandle;
	}

	public void setVenmoHandle(String venmoHandle) {
		this.venmoHandle = venmoHandle;
	}

	public String getZelleEmail() {
		return zelleEmail;
	}

	public void setZelleEmail(String zelleEmail) {
		this.zelleEmail = zelleEmail;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public double getLatitude() {
		return Latitude;
	}

	public void setLatitude(double latitude) {
		Latitude = latitude;
	}

	public double getLongitude() {
		return Longitude;
	}

	public void setLongitude(double longitude) {
		Longitude = longitude;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public String getInstagramUrl() {
		return instagramUrl;
	}

	public void setInstagramUrl(String instagramUrl) {
		this.instagramUrl = instagramUrl;
	}

	public String getFacebookUrl() {
		return facebookUrl;
	}

	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}

}
