package com.demo.LAB02.controller;


import com.demo.LAB02.model.Book;
import com.demo.LAB02.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/books")
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @PostMapping
    public String  addBook(@RequestBody Book book){
        bookService.addBook(book);
        return "Book added successfull";
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book updatebook){
        bookService.updateBook(id,updatebook);
        return "Book updated successfull";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        bookService.deleteBook(id);
        return "Book deleted successfull";
    }

}
