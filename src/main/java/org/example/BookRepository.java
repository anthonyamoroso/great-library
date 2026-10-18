package org.example;

import java.util.List;

public interface BookRepository {
    void addBook(Book book);
    List<Book> getBooksByWord(String word);
    void indexAllBooks();
}
