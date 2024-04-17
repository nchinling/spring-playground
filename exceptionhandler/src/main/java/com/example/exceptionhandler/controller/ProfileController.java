package com.example.exceptionhandler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.exceptionhandler.exception.NullResultException;
import com.example.exceptionhandler.model.Profile;
import com.example.exceptionhandler.service.ProfileService;

@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileSvc;

    @GetMapping("/profile")
    public ResponseEntity<Profile> getProfile() throws NullResultException {
        
        Profile userProfile = profileSvc.retrieveProfile();
        return ResponseEntity.ok(userProfile); 

    }
    
}
