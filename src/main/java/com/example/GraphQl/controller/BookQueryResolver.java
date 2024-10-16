package com.example.GraphQl.controller;

import com.example.GraphQl.model.Book;
import com.example.GraphQl.service.BookService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class BookQueryResolver  {

    private  BookService bookService;


    BookQueryResolver(BookService bookService){
        System.out.println("BookQueryResolver");
        this.bookService = bookService;

    }

    @QueryMapping
    public List<Book> getBooks() {
        System.out.println("Retrieved books: " + bookService.getBooks()); // Log the retrieved books
        return bookService.getBooks();
    }




}
