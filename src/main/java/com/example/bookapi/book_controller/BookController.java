package com.example.bookapi.book_controller;

import com.example.bookapi.book_repository.BookDao;
import com.example.bookapi.book_service.BookService;
import com.example.bookapi.custom_exception.BookNotFoundException;
import com.example.bookapi.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("api/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public Collection<Book> findBooks() {
        return bookService.getListOfBooks();
    }

    @GetMapping("/{iban}")
    public Book getBookByIbanNumber(@PathVariable String iban) throws BookNotFoundException {
        return bookService.getBookByIbanNumber(iban);
    }

    @GetMapping("/{partNumber}")
    public Book getBookByPartNumber(@PathVariable String partNumber) throws BookNotFoundException {
        return bookService.getBookByPartNumber(partNumber);
    }
}
