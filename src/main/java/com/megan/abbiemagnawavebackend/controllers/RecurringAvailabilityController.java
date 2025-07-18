package com.megan.abbiemagnawavebackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.megan.abbiemagnawavebackend.models.RecurringAvailability;
import com.megan.abbiemagnawavebackend.services.RecurringService;


@RestController
@RequestMapping("/api/recurring-availability")
@CrossOrigin(origins = "http://localhost:3000")
public class RecurringAvailabilityController {

    @Autowired
    private RecurringService recurringService;

    // Create a recurring availability
    @PostMapping("/create")
    public ResponseEntity<RecurringAvailability> createRecurringAvailability(@RequestBody RecurringAvailability recurringAvailability) {
        RecurringAvailability created = recurringService.createRecurringAvailability(recurringAvailability);
        return ResponseEntity.ok(created);
    }

    // Get all recurring availabilities (optionally filter by adminId)
    @GetMapping
    public ResponseEntity<List<RecurringAvailability>> getAllRecurringAvailabilities(@RequestParam(required = false) String adminId) {
        List<RecurringAvailability> list = recurringService.getAllRecurringAvailabilities(adminId);
        return ResponseEntity.ok(list);
    }

    // Update recurring availability
    @PutMapping("/{id}")
    public ResponseEntity<RecurringAvailability> updateRecurringAvailability(@PathVariable String id, @RequestBody RecurringAvailability updated) {
        RecurringAvailability saved = recurringService.updateRecurringAvailability(id, updated);
        return ResponseEntity.ok(saved);
    }

    // Delete recurring availability
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecurringAvailability(@PathVariable String id) {
    	recurringService.deleteRecurringAvailability(id);
        return ResponseEntity.noContent().build();
    }
}
