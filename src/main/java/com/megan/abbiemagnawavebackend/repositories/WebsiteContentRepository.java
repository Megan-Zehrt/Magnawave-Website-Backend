package com.megan.abbiemagnawavebackend.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.megan.abbiemagnawavebackend.models.WebsiteContent;

public interface WebsiteContentRepository extends MongoRepository<WebsiteContent, String> {

	Optional<WebsiteContent> findTopByOrderByUpdatedAtDesc();

}
