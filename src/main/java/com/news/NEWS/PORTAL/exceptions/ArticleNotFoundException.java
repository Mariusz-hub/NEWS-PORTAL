package com.news.NEWS.PORTAL.exceptions;




public class ArticleNotFoundException extends RuntimeException{

    public ArticleNotFoundException(String message) {
        super(message);
    }
}
