package com.news.NEWS.PORTAL.service;

import com.news.NEWS.PORTAL.domain.Article;
import com.news.NEWS.PORTAL.domain.News;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class NewsService {

    private static final String NEWS_URL = "http://newsapi.org/v2/";
    private static final String API_KEY = "a6a214f2d26044fb9619e7987a2595b6";
    private RestTemplate restTemplate= new RestTemplate();

    public List<Article> getNewsFor(String category,String country) {
        News news =  callGetMethod("top-headlines?category={category}&country={country}&apiKey={apiKey}",
                News.class,category,country,API_KEY);

        return news.getArticles();
    }

    public List<Article> getArticles(String category, String country){
        List<Article> articleList = getNewsFor(category,country);
        return articleList;
    }


    public <T> T callGetMethod(String url, Class<T> responsType,Object...objects) {
        return  restTemplate.getForObject(NEWS_URL + url,responsType,objects);

    }


}
