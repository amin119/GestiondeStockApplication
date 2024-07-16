package com.chabbah.gestiondestock.repository;

import com.chabbah.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {


    List<Article> findByCodeArticle(String codeArticle, String designation);

}
