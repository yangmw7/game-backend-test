package com.dongyang.minwoo01.repository;

import com.dongyang.minwoo01.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRespository extends CrudRepository<Article, Long> {
}
