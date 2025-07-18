package com.megan.abbiemagnawavebackend.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.megan.abbiemagnawavebackend.models.Appointments;

public interface AppointmentRepository extends MongoRepository<Appointments, String> {

    // Delete all unbooked appointments before a certain date
    void deleteByDateBeforeAndIsBookedFalse(Date now);

    // Find all upcoming available appointments
    List<Appointments> findByDateAfterAndIsBookedFalse(Date now);
    
    List<Appointments> findByIsBookedFalse();
    List<Appointments> findByAdminId(String adminId);
    List<Appointments> findByClientId(String clientId);
    List<Appointments> findByAdminIdAndClientId(String adminId, String clientId);

}
