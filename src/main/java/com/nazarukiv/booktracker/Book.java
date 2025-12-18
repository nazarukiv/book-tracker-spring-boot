package com.nazarukiv.booktracker;

public class Book {
    //atributes of book
    private Long id;
    private String title;
    private String author;
    private int year;
    private BookStatus bookStatus;

    public Book(Long id, String title, String author, int year, BookStatus bookStatus){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.bookStatus = bookStatus;
    }

    //getters
    public Long getId() {
        return id;
    }

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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", status=" + bookStatus +
                '}';
    }

}
