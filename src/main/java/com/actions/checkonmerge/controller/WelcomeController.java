package com.actions.checkonmerge.controller;

import com.actions.checkonmerge.json.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping
  public String index() {
    return "Congratulations! Your application is running!";
  }

  @GetMapping("/welcome")
  public Greeting welcome(@RequestParam String name) {
    return new Greeting(name, "Welcome to this service!");
  }
}
