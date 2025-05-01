package com.dongyang.minwoo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeet(Model mo){
        mo.addAttribute("nameVar", "양민우");
        return "greetings";
    }

}
