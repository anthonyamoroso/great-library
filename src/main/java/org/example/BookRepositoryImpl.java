package org.example;

import java.util.*;

public class BookRepositoryImpl implements BookRepository {

    private final List<Book> books = new ArrayList<>();
    private final Map<String, List<Book>> bookIdsByWord = new HashMap<>();

    @Override
    public void addBook(Book book) {
        index(book);
        books.add(book);
    }

    @Override
    public List<Book> getBooksByWord(String word) {
        return bookIdsByWord.containsKey(word) ? bookIdsByWord.get(word) : new ArrayList<>();
    }

    @Override
    public void indexAllBooks() {
        books.forEach(this::index);
    }

    private void index(Book book) {
        String[] words = getWords(book);
        Arrays.stream(words).forEach(word -> indexByWord(word, book));
    }

    private static String[] getWords(Book book) {
        return book.content()
                .replace(".", "")
                .replace(",", "")
                .replace(";", "")
                .replace(":", "")
                .split(" ");
    }

    private void indexByWord(String word, Book book) {
        if (bookIdsByWord.containsKey(word)) {
            bookIdsByWord.get(word).add(book);
            return;
        }
        bookIdsByWord.put(word, new ArrayList<>(List.of(book)));
    }
}
