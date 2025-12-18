package com.nazarukiv.booktracker;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public List<Book> getBooksByStatus(BookStatus bookStatus) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (book.getBookStatus() == bookStatus) {
                result.add(book);
            }
        }

        return result;
    }
}