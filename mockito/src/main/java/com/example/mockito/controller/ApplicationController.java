package com.example.mockito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/auth")
public class ApplicationController {

    @GetMapping("/welcome")
    public String welcome()
    {
         return "Hey! welcome to my awesome website on a simple spring security authentication!";
    }
    
}
