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

import com.Site.check.Site.Site1;
import com.Site.check.SiteRepository.SiteRepository1;

@RestController  @CrossOrigin(origins = "http://localhost:4200")
public class SiteController1 {
	
	@Autowired
	SiteRepository1 SR;
	
	// Get All Notes
    @GetMapping("/Site1")
    public List<Site1> getAllSite() {
        return SR.findAll();
    }


    // Create a new Note
    @PostMapping("/Site1")
    public Site1 createSite( @RequestBody Site1 site) {
        return SR.save(site);
    }

    // Get a Single Note
    @GetMapping("/Site1/{id}")
    public Site1 getSiteById(@PathVariable(value = "id") Long Id) {
        return SR.findById(Id).orElse(null);
    }

}

