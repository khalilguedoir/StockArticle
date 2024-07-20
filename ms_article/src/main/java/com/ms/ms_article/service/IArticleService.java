package com.ms.ms_article.service;

import com.ms.ms_article.dto.ArticleDTO;
import com.ms.ms_article.model.Article;

import java.util.List;

public interface IArticleService {
    List<ArticleDTO> getAllArticles();
    Article add(Article article);
}
