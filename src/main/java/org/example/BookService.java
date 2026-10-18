package org.example;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book) {
        // check if admin
        bookRepository.addBook(book);
    }

    public List<Book> getBookByWord(String word) {
        return bookRepository.getBooksByWord(word);
    }
}
