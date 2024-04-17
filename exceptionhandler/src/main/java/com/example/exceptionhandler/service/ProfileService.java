package com.example.exceptionhandler.service;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.example.exceptionhandler.exception.NullResultException;
import com.example.exceptionhandler.model.Profile;

@Service
public class ProfileService {
    
    public Profile retrieveProfile() throws NullResultException{
        
        Profile profile = getProfile();
        if (Objects.isNull(profile)){
            //default error message
            throw new NullResultException();
            
            //Customised error message
            // throw new NullResultException("Customised error message");
        }
        return profile;
    }

    private Profile getProfile() {
        return null;
        // return new Profile("John Doe", "Engineers", "Singapore");
    }
}
