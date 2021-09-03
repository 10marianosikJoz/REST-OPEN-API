package com.example.bookapi.book_service;

import com.example.bookapi.book_repository.BookDao;
import com.example.bookapi.custom_exception.BookNotFoundException;
import com.example.bookapi.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> getListOfBooks() {
        return bookDao.getListOfBooks();
    }

    public Book getBookByIbanNumber(String ibanNumber) throws BookNotFoundException {
        return bookDao.getBookByIbanNumber(ibanNumber);
    }

    public Book getBookByPartNumber(String partNumber) throws BookNotFoundException {
        return bookDao.getBookByPartNumber(partNumber);
    }
}
