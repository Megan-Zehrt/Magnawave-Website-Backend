package com.megan.abbiemagnawavebackend.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.megan.abbiemagnawavebackend.models.RecurringAvailability;

public interface RecurringAvailabilityRepository extends MongoRepository<RecurringAvailability, String> {
    
    // Find all recurring availabilities for a given admin
    List<RecurringAvailability> findByAdminId(String adminId);
    
}
