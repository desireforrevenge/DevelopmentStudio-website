package com.org.revenge.devstudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/") //main page
    public String home(Model model) {
        model.addAttribute("title", "Мир"); //page name
        return "home"; //html sample
    }

}