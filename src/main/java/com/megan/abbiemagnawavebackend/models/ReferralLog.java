package com.megan.abbiemagnawavebackend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "referral_logs")
public class ReferralLog {
    @Id
    private String id;

    private String ambassadorId;
    private String referredClientId;
    private Date date = new Date();
    private String actionType; // "signup", "appointment", etc.
    private double discountGiven;

	public ReferralLog() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAmbassadorId() {
		return ambassadorId;
	}

	public void setAmbassadorId(String ambassadorId) {
		this.ambassadorId = ambassadorId;
	}

	public String getReferredClientId() {
		return referredClientId;
	}

	public void setReferredClientId(String referredClientId) {
		this.referredClientId = referredClientId;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public double getDiscountGiven() {
		return discountGiven;
	}

	public void setDiscountGiven(double discountGiven) {
		this.discountGiven = discountGiven;
	}

}
