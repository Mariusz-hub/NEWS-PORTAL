package com.news.NEWS.PORTAL.domain;

public class ArticleDto {

    private String author;
    private String title;
    private String description;
    private String urlToArticle;
    private String urlToImage;

    public ArticleDto() {
    }

    public ArticleDto(String author, String title, String description, String urlToArticle, String urlToImage) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.urlToArticle = urlToArticle;
        this.urlToImage = urlToImage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlToArticle() {
        return urlToArticle;
    }

    public void setUrlToArticle(String urlToArticle) {
        this.urlToArticle = urlToArticle;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    @Override
    public String toString() {
        return "ArticleDto{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", urlToArticle='" + urlToArticle + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                '}';
    }
}
