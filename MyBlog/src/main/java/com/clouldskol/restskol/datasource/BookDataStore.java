package com.clouldskol.restskol.datasource;

import java.util.ArrayList;
import java.util.List;

import com.clouldskol.restskol.model.Book;

public class BookDataStore {
	 private static final BookDataStore bookDataStore = new BookDataStore();
	    private List<Book> availableBooks = new ArrayList<>();
	 
	    public static final synchronized BookDataStore getInstance() {
	        return bookDataStore;
	    }
 
    public List<Book> getBooks() {
        if (availableBooks.isEmpty()) {
            initialize();
        }
 
        return availableBooks;
    }
 
    public Book getBook(String id) {
        if (availableBooks.isEmpty()) {
            initialize();
        }
 
        for (Book book : availableBooks) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
 
        return null;
    }
 
    public void initialize() {
        availableBooks.add(createBook("1", "The Lean Startup", "Eric Ries",
                "0670921602"));
        availableBooks.add(createBook("2", "Zero to one", "Peter Thiel",
                "0753555190"));
        availableBooks.add(createBook("3", "The 100$ Start-up", "Chris Guillebeau",
                "023076651X"));
    }
 
    public Book createBook(String id, String title,
                           String author, String isbn) {
        final Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);
 
        return book;
    }
}
