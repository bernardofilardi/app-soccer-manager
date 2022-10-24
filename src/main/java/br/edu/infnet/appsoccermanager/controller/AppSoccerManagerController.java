package br.edu.infnet.appsoccermanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppSoccerManagerController {

    @GetMapping("/")
    public String toHome() {
        return "home";
    }
}
