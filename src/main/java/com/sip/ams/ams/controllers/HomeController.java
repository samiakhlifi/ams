package com.sip.ams.ams.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
    @GetMapping("/info")
    public String home() {

        return "home/info";
    }
}
