package com.megan.abbiemagnawavebackend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megan.abbiemagnawavebackend.models.WebsiteContent;
import com.megan.abbiemagnawavebackend.services.WebsiteContentService;

@RestController
@RequestMapping("/api/website-content")
@CrossOrigin(origins = "http://localhost:3000")
public class WebsiteContentController {

    @Autowired
    private WebsiteContentService webContentServ;

    // Fetch the latest content (no /latest suffix, just GET /api/website-content)
    @GetMapping
    public WebsiteContent getLatestContent() {
        return webContentServ.getLatestPublishedContent();
    }

    // Create or update website content
    @PutMapping
    public WebsiteContent createOrUpdateWebsiteContent(@RequestBody WebsiteContent content) {
        return webContentServ.createOrUpdateWebsiteContent(content);
    }
}
