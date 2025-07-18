package com.megan.abbiemagnawavebackend.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "appointments")
public class Appointments {

    @Id
    private String id;

    private String adminId;
    private String clientId;

    private String appointmentType;
    private String description;

    private String discountCodeUsed;
    private double originalCost;
    private double discountedCost;
    private boolean isPaid = true;

    private boolean isPartOfSubscription;
    private String subscriptionId;

    private Date date;
    private String time;

    private boolean isBooked = false;

    private int numberOfHorses;

    private String location;
    private double latitude;
    private double longitude;

    private String notes;

    // === New fields for appointment policies ===
    private double lateBookingFee = 0.0; // set if booked within 24 hrs
    private double cancellationFee = 0.0; // set if cancelled within 24 hrs
    private double nonRefundableDeposit = 0.0; // usually 25% of original cost

    private Date createdAt = new Date();
    private Date updatedAt;

    public Appointments() {
        // Default constructor
    }

    // === Getters and Setters ===

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }

    public String getClientId() { return clientId; }
    public void setClientId(String clientId) { this.clientId = clientId; }

    public String getAppointmentType() { return appointmentType; }
    public void setAppointmentType(String appointmentType) { this.appointmentType = appointmentType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getDiscountCodeUsed() { return discountCodeUsed; }
    public void setDiscountCodeUsed(String discountCodeUsed) { this.discountCodeUsed = discountCodeUsed; }

    public double getOriginalCost() { return originalCost; }
    public void setOriginalCost(double originalCost) { this.originalCost = originalCost; }

    public double getDiscountedCost() { return discountedCost; }
    public void setDiscountedCost(double discountedCost) { this.discountedCost = discountedCost; }

    public boolean isPaid() { return isPaid; }
    public void setPaid(boolean isPaid) { this.isPaid = isPaid; }

    public boolean isPartOfSubscription() { return isPartOfSubscription; }
    public void setPartOfSubscription(boolean isPartOfSubscription) { this.isPartOfSubscription = isPartOfSubscription; }

    public String getSubscriptionId() { return subscriptionId; }
    public void setSubscriptionId(String subscriptionId) { this.subscriptionId = subscriptionId; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public boolean isBooked() { return isBooked; }
    public void setBooked(boolean isBooked) { this.isBooked = isBooked; }

    public int getNumberOfHorses() { return numberOfHorses; }
    public void setNumberOfHorses(int numberOfHorses) { this.numberOfHorses = numberOfHorses; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public double getLatitude() { return latitude; }
    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public double getLateBookingFee() { return lateBookingFee; }
    public void setLateBookingFee(double lateBookingFee) { this.lateBookingFee = lateBookingFee; }

    public double getCancellationFee() { return cancellationFee; }
    public void setCancellationFee(double cancellationFee) { this.cancellationFee = cancellationFee; }

    public double getNonRefundableDeposit() { return nonRefundableDeposit; }
    public void setNonRefundableDeposit(double nonRefundableDeposit) { this.nonRefundableDeposit = nonRefundableDeposit; }

    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }

    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
}
