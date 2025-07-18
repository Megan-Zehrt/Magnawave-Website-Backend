package com.megan.abbiemagnawavebackend.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.megan.abbiemagnawavebackend.models.WebsiteContent;
import com.megan.abbiemagnawavebackend.repositories.WebsiteContentRepository;

@Service
public class WebsiteContentService {

    @Autowired
    private WebsiteContentRepository websiteContentRepository;

    public WebsiteContent createOrUpdateWebsiteContent(WebsiteContent content) {
        content.setUpdatedAt(new Date());

        // If new content (no id), set createdAt
        if (content.getId() == null || content.getId().isEmpty()) {
            content.setCreatedAt(new Date());
        }

        return websiteContentRepository.save(content);
    }

    public WebsiteContent getLatestPublishedContent() {
        // You can enhance this later with sorting or filtering by isPublished
        return websiteContentRepository.findAll().stream()
                .findFirst()
                .orElse(null);
    }
}