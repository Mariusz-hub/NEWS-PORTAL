package com.news.NEWS.PORTAL.controller;


import com.news.NEWS.PORTAL.domain.ArticleDto;
import com.news.NEWS.PORTAL.exceptions.ArticleNotFoundException;
import com.news.NEWS.PORTAL.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//TODO
// 1. Add View to each Get
// 2. Add view to user Choice

@RestController
@RequestMapping("/api")
public class NewsController {

    private final NewsService newsService;
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);


    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/articles/{category}/{country}")
    public ResponseEntity<List<ArticleDto>> getArticles(@PathVariable String category, @PathVariable String country) {
        List<ArticleDto> articleDtos = newsService.getArticles(category, country);
        if (articleDtos.isEmpty()) {
            LOGGER.error("Articles not found");
            throw new ArticleNotFoundException("Articles not found");
        }
        LOGGER.info(articleDtos.size() + " Articles found !");
        return new ResponseEntity<>(articleDtos, HttpStatus.OK);

    }

    @GetMapping("/articles/sports/pl")
    public ResponseEntity<List<ArticleDto>> getArticlesFromSportInPL() {
        List<ArticleDto> articleDtos = newsService.getArticles("sports", "pl");
        if (articleDtos.isEmpty()) {
            LOGGER.error("Articles not found");
            throw new ArticleNotFoundException("Articles not found");
        }
        LOGGER.info(articleDtos.size() + " Articles found !");
        return new ResponseEntity<>(articleDtos, HttpStatus.OK);

    }

    @GetMapping("/articles/business/pl")
    public ResponseEntity<List<ArticleDto>> getArticlesFromBussinesInPl() {
        List<ArticleDto> articleDtos = newsService.getArticles("business", "pl");
        if (articleDtos.isEmpty()) {
            LOGGER.error("Articles not found");
            throw new ArticleNotFoundException("Articles not found");
        }
        LOGGER.info(articleDtos.size() + " Articles found !");
        return new ResponseEntity<>(articleDtos, HttpStatus.OK);

    }

    @GetMapping("/articles/sport/us")
    public ResponseEntity<List<ArticleDto>> getArticlesFromSportInUs() {
        List<ArticleDto> articleDtos = newsService.getArticles("sports", "us");
        if (articleDtos.isEmpty()) {
            LOGGER.error("Articles not found");
            throw new ArticleNotFoundException("Articles not found");
        }
        LOGGER.info(articleDtos.size() + " Articles found !");
        return new ResponseEntity<>(articleDtos, HttpStatus.OK);

    }

    @GetMapping("/articles/business/us")
    public ResponseEntity<List<ArticleDto>> getArticlesFromBusinessInUs() {
        List<ArticleDto> articleDtos = newsService.getArticles("business", "us");
        if (articleDtos.isEmpty()) {
            LOGGER.error("Articles not found");
            throw new ArticleNotFoundException("Articles not found");
        }
        LOGGER.info(articleDtos.size() + " Articles found !");
        return new ResponseEntity<>(articleDtos, HttpStatus.OK);

    }
}
