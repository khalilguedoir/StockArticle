package com.ms.ms_article.controller;

import com.ms.ms_article.dto.ArticleDTO;
import com.ms.ms_article.model.Article;
import com.ms.ms_article.service.IArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/articles")
public class ArticleController {
    private final IArticleService articleService;

    @GetMapping
    List<ArticleDTO> getAllArticles(){
        return this.articleService.getAllArticles();
    }
    @PostMapping
    Article add(@RequestBody Article article){
        return this.articleService.add(article);
    }
}
