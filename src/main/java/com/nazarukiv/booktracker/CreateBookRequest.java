package com.nazarukiv.booktracker;

public class CreateBookRequest {
    private String title;
    private String author;
    private int year;
    private BookStatus bookStatus;

    public CreateBookRequest(String title, String author, int year, BookStatus bookStatus){
        this.title = title;
        this.author = author;
        this.year = year;
        this.bookStatus = bookStatus;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }
}
