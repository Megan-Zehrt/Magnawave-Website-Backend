package com.megan.abbiemagnawavebackend.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megan.abbiemagnawavebackend.models.Appointments;
import com.megan.abbiemagnawavebackend.repositories.AppointmentRepository;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepo;

    // Create a new appointment
    public Appointments createAppointment(Appointments appointment) {
        appointment.setBooked(false);
        appointment.setCreatedAt(new Date());
        appointment.setUpdatedAt(new Date());
        return appointmentRepo.save(appointment);
    }

    // Get all available (not booked) appointments
    public List<Appointments> getAvailableAppointments() {
        return appointmentRepo.findByIsBookedFalse();
    }

    // Book appointment by setting clientId and marking booked
    public Appointments bookAppointment(String appointmentId, String clientId) {
        Optional<Appointments> opt = appointmentRepo.findById(appointmentId);
        if (opt.isEmpty()) {
            throw new IllegalArgumentException("Appointment not found");
        }
        Appointments appointment = opt.get();
        if (appointment.isBooked()) {
            throw new IllegalStateException("Appointment already booked");
        }
        appointment.setClientId(clientId);
        appointment.setBooked(true);
        appointment.setUpdatedAt(new Date());

        // TODO: calculate late fee if booked within 24 hours (business logic)

        return appointmentRepo.save(appointment);
    }

    // Delete appointment by id
    public void deleteAppointment(String id) {
        appointmentRepo.deleteById(id);
    }

    // Decline appointment (you can define the logic)
    public Appointments declineAppointment(String id) {
        Optional<Appointments> opt = appointmentRepo.findById(id);
        if (opt.isEmpty()) {
            throw new IllegalArgumentException("Appointment not found");
        }
        Appointments appointment = opt.get();

        // Example logic: mark as not booked and remove clientId
        appointment.setBooked(false);
        appointment.setClientId(null);
        appointment.setUpdatedAt(new Date());

        return appointmentRepo.save(appointment);
    }

    // Get all appointments, filtered optionally by adminId and/or clientId
    public List<Appointments> getAppointments(String adminId, String clientId) {
        if (adminId != null && !adminId.isEmpty() && clientId != null && !clientId.isEmpty()) {
            return appointmentRepo.findByAdminIdAndClientId(adminId, clientId);
        }
        if (adminId != null && !adminId.isEmpty()) {
            return appointmentRepo.findByAdminId(adminId);
        }
        if (clientId != null && !clientId.isEmpty()) {
            return appointmentRepo.findByClientId(clientId);
        }
        return appointmentRepo.findAll();
    }
}
