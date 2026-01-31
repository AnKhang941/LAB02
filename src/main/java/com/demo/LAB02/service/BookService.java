package com.demo.LAB02.service;

import com.demo.LAB02.model.Book;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> books=new ArrayList<>();

    public void initData() {
        books.add(new Book(1, "Clean Code", "Robert C. Martin"));
        books.add(new Book(2, "Effective Java", "Joshua Bloch"));
        books.add(new Book(3, "Spring in Action", "Craig Walls"));
        books.add(new Book(4, "Design Patterns", "Erich Gamma"));
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookById(int id) {
        return books.stream().filter(book -> book.getId()==id).findFirst().orElse(null);

    }
    public void  addBook(Book book) {
         books.add(book);
    }
    public void updateBook(int id,Book updatedBook){
        books.stream().filter(book -> book.getId()==id).findFirst()
                .ifPresent(book ->{ book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());});
    }
    public void deleteBook(int id){

        books.removeIf(book -> book.getId()==id);
    }

}
