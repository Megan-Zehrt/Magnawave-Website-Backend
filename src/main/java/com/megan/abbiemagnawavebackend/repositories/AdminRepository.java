package com.megan.abbiemagnawavebackend.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.megan.abbiemagnawavebackend.models.Admin;

public interface AdminRepository extends MongoRepository<Admin, String>{
	Optional<Admin> findByEmail(String email);
	boolean existsByEmail(String email);
}
