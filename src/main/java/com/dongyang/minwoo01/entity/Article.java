package com.dongyang.minwoo01.entity;

import jakarta.persistence.*;

@Entity
//@Table(name="users")
public class Article {
    public Article(Long id, String title, String content) {
        this.content = content;
        this.id = id;
        this.title = title;
    }

    public Article() {
    }

    @Id //pk키 역할
    @GeneratedValue
    private Long id;
    @Column
    private String title;
    @Column
    private String content;

    public Long getId() {
        return id;
    }
}
