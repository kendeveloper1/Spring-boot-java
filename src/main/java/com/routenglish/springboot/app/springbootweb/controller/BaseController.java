package com.routenglish.springboot.app.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class BaseController {
    @GetMapping(value = "/home")
    public String home(Model model) {
        model.addAttribute("Title","example with model");
        return "home";
    }
}
