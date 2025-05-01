package com.dongyang.minwoo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
    @GetMapping("/random")
    public String randomQuote(Model model){
        String[] quotes = {
                "모든것이 끗나버리기 전에 정신 바싹챙기자",
                "살아보려고 재발.",
                "북조선 린민군 훈련왈료.",
                "꿈이 버거. 왕 이라는 놈이",
                "힘네자 재발."
        };
        int randInt = (int) (Math.random() * quotes.length);
        model.addAttribute("randomQuote", quotes[randInt]);
        return "quote";
    }

}
