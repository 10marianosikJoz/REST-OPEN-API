package com.example.bookapi.book_repository;

import com.example.bookapi.custom_exception.BookNotFoundException;
import com.example.bookapi.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDao {

    private static List<Book> books;

    static {
        books = List.of(new Book(1L, "In Search of Lost Time", "Marcel Proust", "Helion", "22", "2"),
                new Book(2L, "Ulysses", "James Joyce", "Helion", "12", "3"),
                new Book(3L, "Don Quixote", "Miguel de Cervantes", "Helion", "90", "3"),
                new Book(4L, "One Hundred Years of Solitude", "Gabriel Garcia Marquez", "Helion", "16", "3"),
                new Book(5L, "The Great Gatsby", "F. Scott Fitzgerald", "Helion", "2", "6"),
                new Book(6L, "Moby Dick", "Herman Melville", "Helion", "66", "1"),
                new Book(7L, "War and Peace", "Leo Tolstoy", "Helion", "74", "3"),
                new Book(8L, "Hamlet ", "William Shakespeare", "Helion", "27", "5"),
                new Book(9L, "The Odyssey", "Homer", "Helion", "452", "1"),
                new Book(10L, "Madame Bovary", "Gustave Flaubert", "Helion", "555", "1"));

    }

    public Book getBookByIbanNumber(String ibanNumber) throws BookNotFoundException {
        return books.stream()
                .filter(it -> it.getIbanNumber().equals(ibanNumber))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    public Book getBookByPartNumber(String partNumber) throws BookNotFoundException {
        return books.stream()
                .filter(it -> it.getBook_part().equals(partNumber))
                .findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found"));
    }

    public List<Book> getListOfBooks() {
        return books;
    }

}
