package com.example.tanzu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/")
  public String home() {
    return "Hello World";
  }

  @GetMapping("/second")
  public String secondHome() {
    return "This is the best!";
  }

}