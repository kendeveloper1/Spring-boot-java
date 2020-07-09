package com.routenglish.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @GetMapping(value = "/home")
    public String home() {
        return "home";
    }
}
