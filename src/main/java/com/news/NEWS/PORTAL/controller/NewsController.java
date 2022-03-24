package com.news.NEWS.PORTAL.controller;

import com.news.NEWS.PORTAL.domain.Article;
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
    public List<Article> getArticles(@PathVariable String category, @PathVariable String country){
       List<Article> articles = newsService.getArticles(category,country);
       List<Article> authors = articles.stream().map(article -> new Article(article.getAuthor(),article.getTitle(),article.getDescription()))
               .collect(Collectors.toList());
       return authors;
    }
}
