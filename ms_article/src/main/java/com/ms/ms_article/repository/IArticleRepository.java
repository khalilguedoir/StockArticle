package com.ms.ms_article.repository;

import com.ms.ms_article.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticleRepository extends JpaRepository<Article,Long> {
}
