package com.megan.abbiemagnawavebackend.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Document(collection = "client")
public class Clients {
	
	@Id
	private String id;
	
	@NotEmpty(message = "First name is required!")
	@Size(min = 3,max = 15,message = "First name must be between 3 and 15 characters")
	private String firstName;
	
	@NotEmpty(message = "Last name is required!")
	@Size(min = 3,max = 15,message = "Last name must be between 3 and 15 characters")
	private String lastname;
	
	@NotEmpty(message = "Email is required!")
	@Email(message = "Please enter a valid email!")
	@Indexed(unique = true)
	 private String email;
	
	@NotEmpty(message = "Password is required!")
	@Size(min = 8,max = 128,message = "Password must be between 8 and 200 characters" )
	private String password;
	
	@Transient
	@NotEmpty(message = "ConfirmPassword is required!")
	@Size(min = 8,max = 128,message = "Confirm Password must be between 8 and 200 characters" )
	private String confirm;
	
	private boolean isAmbassador;
	private String referralCode;
	private String discountType;
	private double discountValue;
	private int referalCredits = 0;
	
	private String accountType;
	
	private List<String> subscriptionIds;
	private boolean isSubscribed;
	private Date nextBillingDate;

	private List<String> appointmentIds;
	
	private String phoneNumber;
	private String profileImageUrl;
	
	private Date createdAt = new Date();
	private boolean isActive = true;

	public Clients() {
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

	public boolean isAmbassador() {
		return isAmbassador;
	}

	public void setAmbassador(boolean isAmbassador) {
		this.isAmbassador = isAmbassador;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public List<String> getSubscriptionIds() {
		return subscriptionIds;
	}

	public void setSubscriptionIds(List<String> subscriptionIds) {
		this.subscriptionIds = subscriptionIds;
	}

	public boolean isSubscribed() {
		return isSubscribed;
	}

	public void setSubscribed(boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
	}

	public Date getNextBillingDate() {
		return nextBillingDate;
	}

	public void setNextBillingDate(Date nextBillingDate) {
		this.nextBillingDate = nextBillingDate;
	}

	public List<String> getAppointmentIds() {
		return appointmentIds;
	}

	public void setAppointmentIds(List<String> appointmentIds) {
		this.appointmentIds = appointmentIds;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	public int getReferalCredits() {
		return referalCredits;
	}

	public void setReferalCredits(int referalCredits) {
		this.referalCredits = referalCredits;
	}

}
