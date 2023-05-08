package com.example.mockbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping("/403")
    public String e403() {
        return "403";
    }
}
