package com.news.NEWS.PORTAL.controller;

import com.news.NEWS.PORTAL.domain.ArticleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FrontNewsController {

    @GetMapping("/home")
    public String homePage(ModelMap modelMap){
        ArticleDto articleDto = new ArticleDto("Mario","O rybach","Coś tam","www","ww");
        ArticleDto articleDto1 = new ArticleDto("Małpa","O psach","Coś tam","www","ww");
        List<ArticleDto> articleList = new ArrayList<>();
        articleList.add(articleDto);
        articleList.add(articleDto1);
        modelMap.addAttribute("article",articleDto);
        modelMap.addAttribute("art",articleList);

        return "homePage";
    }
}
