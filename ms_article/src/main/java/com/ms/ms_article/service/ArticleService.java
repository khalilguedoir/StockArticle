package com.ms.ms_article.service;

import com.ms.ms_article.dto.ArticleDTO;
import com.ms.ms_article.dto.StockDTO;
import com.ms.ms_article.model.Article;
import com.ms.ms_article.repository.IArticleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ArticleService implements IArticleService{
    private final IStockClient stockClient;
    private final IArticleRepository articleRepository;
    public List<ArticleDTO> getAllArticles() {
        List<Article> articles = this.articleRepository.findAll();
        return articles.stream().map(this::mapToArticleDTO).collect(Collectors.toList());
    }

    @Override
    public Article add(Article article) {
        return this.articleRepository.save(article);
    }

    private ArticleDTO mapToArticleDTO(Article article) {
        ArticleDTO articleDTO = new ArticleDTO();
        articleDTO.setId(article.getId());
        articleDTO.setName(article.getName());
        StockDTO stock = stockClient.getStockById(article.getStock_id());
        articleDTO.setStockDTO(stock);
        return articleDTO;
    }
}
