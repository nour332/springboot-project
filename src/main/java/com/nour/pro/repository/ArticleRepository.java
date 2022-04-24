package com.nour.pro.repository;

import org.springframework.data.repository.CrudRepository;

import com.nour.pro.model.Article;


public interface ArticleRepository extends CrudRepository<Article, Long>{

}
