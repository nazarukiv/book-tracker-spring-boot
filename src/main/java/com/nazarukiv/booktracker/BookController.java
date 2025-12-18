package com.nazarukiv.booktracker;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookDto> getBooks() {
        List<BookDto> result = new ArrayList<>();

        for (Book book : bookService.getAllBooks()) {
            result.add(mapToDto(book));
        }

        return result;
    }

    @GetMapping("/books/status")
    public List<BookDto> getBooksByStatus(@RequestParam("status") BookStatus status) {
        List<BookDto> result = new ArrayList<>();

        for (Book book : bookService.getBooksByStatus(status)) {
            result.add(mapToDto(book));
        }

        return result;
    }

    @PostMapping("/books")
    public void addBook(@RequestBody CreateBookRequest request) {

        long id = System.currentTimeMillis();

        Book book = new Book(
                id,
                request.getTitle(),
                request.getAuthor(),
                request.getYear(),
                request.getBookStatus()
        );

        bookService.addBook(book);
    }


    private BookDto mapToDto(Book book) {
        return new BookDto(
                book.getTitle(),
                book.getAuthor(),
                book.getYear(),
                book.getBookStatus()
        );
    }
}
