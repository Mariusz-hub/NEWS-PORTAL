package com.news.NEWS.PORTAL.utils;

import com.news.NEWS.PORTAL.domain.Article;
import com.news.NEWS.PORTAL.domain.News;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class WebClient {

    private static final String NEWS_URL = "http://newsapi.org/v2/";
    private static final String API_KEY = "a6a214f2d26044fb9619e7987a2595b6";
    private RestTemplate restTemplate= new RestTemplate();

//    public News getNewsFor() {
//        News news =  callGetMethod("top-headlines?category=business&country=pl&apiKey={apiKey}",
//                News.class,API_KEY);
//        List<Article> article = news.getArticles();
//
//        return
//    }
//
//
//    public <T> T callGetMethod(String url, Class<T> responsType,Object...objects) {
//        return  restTemplate.getForObject(NEWS_URL + url,responsType,objects);
//
//    }

}
