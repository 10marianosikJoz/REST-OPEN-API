package com.example.bookapi.model;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String ibanNumber;
    private String book_part;

    public Book(Long id, String title, String author, String publisher, String ibanNumber, String book_part) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ibanNumber = ibanNumber;
        this.book_part = book_part;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIbanNumber() {
        return ibanNumber;
    }

    public void setIbanNumber(String ibanNumber) {
        this.ibanNumber = ibanNumber;
    }

    public String getBook_part() {
        return book_part;
    }

    public void setBook_part(String book_part) {
        this.book_part = book_part;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
