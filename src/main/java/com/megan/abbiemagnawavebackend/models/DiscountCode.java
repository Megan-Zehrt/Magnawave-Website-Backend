package com.megan.abbiemagnawavebackend.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "discount_codes")
public class DiscountCode {

    @Id
    private String id;

    private String code;              // e.g., "AMBER10"
    private String ambassadorId;      // who owns it (optional)

    private String type;              // "percent" or "flat"
    private double value;             // 10.0 = 10% or $10

    private Date expiresAt;
    private boolean isActive = true;
    private int maxUses;
    private int timesUsed = 0;

	public DiscountCode() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAmbassadorId() {
		return ambassadorId;
	}

	public void setAmbassadorId(String ambassadorId) {
		this.ambassadorId = ambassadorId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Date expiresAt) {
		this.expiresAt = expiresAt;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getMaxUses() {
		return maxUses;
	}

	public void setMaxUses(int maxUses) {
		this.maxUses = maxUses;
	}

	public int getTimesUsed() {
		return timesUsed;
	}

	public void setTimesUsed(int timesUsed) {
		this.timesUsed = timesUsed;
	}

}
