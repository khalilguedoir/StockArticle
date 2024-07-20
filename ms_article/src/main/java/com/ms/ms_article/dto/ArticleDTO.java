package com.ms.ms_article.dto;

import com.ms.ms_article.model.Article;
import lombok.Data;

import java.util.List;

@Data
public class ArticleDTO {
    private Long id;
    private String name;
    private Float quantity;
    private StockDTO stockDTO;
}
