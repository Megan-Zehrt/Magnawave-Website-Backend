package com.megan.abbiemagnawavebackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.megan.abbiemagnawavebackend.models.Admin;
import com.megan.abbiemagnawavebackend.repositories.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepo;
	
	@Autowired
	private BCryptPasswordEncoder bCrypt;
	
	public Admin registerAdmin(Admin newAdmin) {
		if(!newAdmin.getPassword().equals(newAdmin.getConfirm())) {
			throw new IllegalArgumentException("Passwords do not Match!");
		}
		
		if(adminRepo.existsByEmail(newAdmin.getEmail())) {
			throw new IllegalArgumentException("Email already in use.");
		}
		
		newAdmin.setPassword(bCrypt.encode(newAdmin.getPassword()));
		newAdmin.setConfirm(null);
		
		return adminRepo.save(newAdmin);
	}
	
	public Optional<Admin> findByEmail(String email) {
		return adminRepo.findByEmail(email);
	}
	
	public Admin getAdminInformation() {
		return adminRepo.findAll().stream().findFirst().orElse(null);
	}

}
