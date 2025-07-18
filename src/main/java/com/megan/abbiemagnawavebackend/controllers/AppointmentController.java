package com.megan.abbiemagnawavebackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.megan.abbiemagnawavebackend.models.Appointments;
import com.megan.abbiemagnawavebackend.services.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "http://localhost:3000")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    // Admin: Create a new appointment (could be one-off or generated)
    @PostMapping("/create")
    public ResponseEntity<Appointments> createAppointment(@RequestBody Appointments appointment) {
        Appointments created = appointmentService.createAppointment(appointment);
        return ResponseEntity.ok(created);
    }

    // Get all available appointments (not booked)
    @GetMapping("/available")
    public ResponseEntity<List<Appointments>> getAvailableAppointments() {
        List<Appointments> available = appointmentService.getAvailableAppointments();
        return ResponseEntity.ok(available);
    }

    // Client: Book an appointment (set clientId, mark booked)
    @PutMapping("/book/{id}")
    public ResponseEntity<Appointments> bookAppointment(@PathVariable String id, @RequestParam String clientId) {
        Appointments booked = appointmentService.bookAppointment(id, clientId);
        return ResponseEntity.ok(booked);
    }

    // Admin: Remove (delete) appointment by id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable String id) {
        appointmentService.deleteAppointment(id);
        return ResponseEntity.noContent().build();
    }

    // Admin: Decline an appointment - here you can define what that means
    // For example, set a status or delete, or mark cancelled with fee
    @PutMapping("/decline/{id}")
    public ResponseEntity<Appointments> declineAppointment(@PathVariable String id) {
        Appointments declined = appointmentService.declineAppointment(id);
        return ResponseEntity.ok(declined);
    }

    // Get all appointments for admin or client (optional filtering)
    @GetMapping
    public ResponseEntity<List<Appointments>> getAppointments(@RequestParam(required = false) String adminId,
                                                              @RequestParam(required = false) String clientId) {
        List<Appointments> appointments = appointmentService.getAppointments(adminId, clientId);
        return ResponseEntity.ok(appointments);
    }
}
