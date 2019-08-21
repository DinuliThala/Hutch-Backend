package com.Site.check.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Site.check.Site.Site;
import com.Site.check.SiteRepository.SiteRepository;

@RestController @CrossOrigin(origins = "http://localhost:4200")
public class SiteController {
	
	@Autowired
	SiteRepository SR;
	
	// Get All Notes
    @GetMapping("/Site")
    public List<Site> getAllSite() {
        return SR.findAll();
    }


    // Create a new Note
    @PostMapping("/Site")
    public Site createSite( @RequestBody Site site) {
        return SR.save(site);
    }

    // Get a Single Note
    @GetMapping("/Site/{id}")
    public Site getSiteById(@PathVariable(value = "id") Long Id) {
        return SR.findById(Id).orElse(null);
    }

}
