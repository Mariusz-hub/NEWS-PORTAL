package com.news.NEWS.PORTAL.controller;

import com.news.NEWS.PORTAL.domain.ArticleDto;
import com.news.NEWS.PORTAL.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontNewsController {

    private final NewsService newsService;

    public FrontNewsController(NewsService newsService) {
        this.newsService = newsService;
    }


    @GetMapping("/home")
    public String homePage2(ModelMap modelMap){
        List<ArticleDto> articleDtos = newsService.getArticles("sports", "pl");
        modelMap.addAttribute("art",articleDtos);
        return "homePage";
    }


}
