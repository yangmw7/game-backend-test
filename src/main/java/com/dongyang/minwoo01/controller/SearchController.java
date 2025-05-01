package com.dongyang.minwoo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {
    @GetMapping("/search")
    public String mainSearch(@RequestParam("mainSearchKeyword") String searchKeyWord){
        System.out.println("검색어 : " + searchKeyWord);
        return "";
    }

}
