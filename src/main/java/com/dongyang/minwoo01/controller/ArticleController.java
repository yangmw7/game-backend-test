package com.dongyang.minwoo01.controller;

import com.dongyang.minwoo01.dto.ArticleForm;
import com.dongyang.minwoo01.entity.Article;
import com.dongyang.minwoo01.repository.ArticleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired
    ArticleRespository articleRespository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "boaders/new";
    }

    @PostMapping("/articles/create")
    public String newArticleForm(ArticleForm articleForm){
        Article article = articleForm.toEntity();
        Article saved = articleRespository.save(article);
        System.out.println("dto value: " + articleForm.toString());
        return "forward:/articles/" + saved.getId();
    }

    @GetMapping("/articles/{id}")
    public String show(@PathVariable("id") Long id){
        System.out.println("id값 : " + id);
        return "";

    }
}
