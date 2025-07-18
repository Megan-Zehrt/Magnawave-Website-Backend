package com.megan.abbiemagnawavebackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megan.abbiemagnawavebackend.models.RecurringAvailability;
import com.megan.abbiemagnawavebackend.repositories.RecurringAvailabilityRepository;

@Service
public class RecurringService {

    @Autowired
    private RecurringAvailabilityRepository recurringAvailabilityRepo;

    // Create new recurring availability
    public RecurringAvailability createRecurringAvailability(RecurringAvailability availability) {
        return recurringAvailabilityRepo.save(availability);
    }

    // Get all or filter by adminId
    public List<RecurringAvailability> getAllRecurringAvailabilities(String adminId) {
        if (adminId != null && !adminId.isEmpty()) {
            return recurringAvailabilityRepo.findByAdminId(adminId);
        }
        return recurringAvailabilityRepo.findAll();
    }

    // Update recurring availability by id
    public RecurringAvailability updateRecurringAvailability(String id, RecurringAvailability updated) {
        Optional<RecurringAvailability> existingOpt = recurringAvailabilityRepo.findById(id);
        if (existingOpt.isEmpty()) {
            throw new IllegalArgumentException("Recurring availability not found");
        }
        RecurringAvailability existing = existingOpt.get();

        existing.setAdminId(updated.getAdminId());
        existing.setAppointmentType(updated.getAppointmentType());
        existing.setDescription(updated.getDescription());
        existing.setDayOfWeek(updated.getDayOfWeek());
        existing.setTime(updated.getTime());    
        existing.setTime(updated.getEndTime()); // This replaces setStartTime
        existing.setPrice(updated.getPrice());
        existing.setNumberOfHorses(updated.getNumberOfHorses());
        existing.setLocation(updated.getLocation());
        existing.setStartDate(updated.getStartDate());
        existing.setEndDate(updated.getEndDate());
        existing.setActive(updated.isActive());


        return recurringAvailabilityRepo.save(existing);
    }

    // Delete by id
    public void deleteRecurringAvailability(String id) {
        recurringAvailabilityRepo.deleteById(id);
    }
}
