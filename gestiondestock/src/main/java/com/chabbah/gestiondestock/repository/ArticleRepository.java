package com.chabbah.gestiondestock.repository;

import com.chabbah.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {


}
