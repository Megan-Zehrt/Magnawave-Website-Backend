package com.megan.abbiemagnawavebackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megan.abbiemagnawavebackend.models.Admin;
import com.megan.abbiemagnawavebackend.services.AdminService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

	@Autowired
	private AdminService adminServ;
	
	@PostMapping("/create")
	public ResponseEntity<?> createAdmin(@Valid @RequestBody Admin admin) {
		try {
			Admin savedAdmin = adminServ.registerAdmin(admin);
			return ResponseEntity.ok(savedAdmin);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@GetMapping("/information")
	public ResponseEntity<?> getAdmininformation() {
	    Admin admin = adminServ.getAdminInformation();
	    if (admin == null) {
	        return ResponseEntity.status(404).body("No admin found.");
	    }
	    return ResponseEntity.ok(admin);
	}


}
