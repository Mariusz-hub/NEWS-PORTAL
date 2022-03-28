package com.news.NEWS.PORTAL.controller;

import com.news.NEWS.PORTAL.domain.Article;
import com.news.NEWS.PORTAL.domain.ArticleDto;
import com.news.NEWS.PORTAL.domain.News;
import com.news.NEWS.PORTAL.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class NewsController {

    private final NewsService newsService;


    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/articles/{category}/{country}")
    public List<ArticleDto> getArticles(@PathVariable String category, @PathVariable String country){
        List<ArticleDto> articleDtos = newsService.getArticles(category,country);
       return articleDtos;

    }
}
