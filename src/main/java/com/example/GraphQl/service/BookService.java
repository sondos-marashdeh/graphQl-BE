package com.example.GraphQl.service;


import com.example.GraphQl.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService   {
private final List<Book> books = new ArrayList<>();

public BookService(){
    books.add(new Book("Software Architecture for Developers", "Simon Brown", 2016, "Software Architecture"));
    books.add(new Book("Building Evolutionary Architectures", "Neal Ford, Rebecca Parsons, Patrick Kua", 2017, "Software Architecture"));
    books.add(new Book("The Software Architect Elevator", "Gregor Hohpe", 2013, "Software Architecture"));
    books.add(new Book("Designing Data-Intensive Applications", "Martin Kleppmann", 2017, "Software Architecture"));

    books.add(new Book("Web Security for Developers", "Ben Shaw, Chris O'Rourke", 2020, "Security"));
    books.add(new Book("The Web Application Hacker's Handbook", "Dafydd Stuttard, Marcus Pinto", 2011, "Security"));
    books.add(new Book("Security Engineering: A Guide to Building Dependable Distributed Systems", "Ross J. Anderson", 2020, "Security"));

    books.add(new Book("Artificial Intelligence: A Guide to Intelligent Systems", "Michael Negnevitsky", 2011, "Artificial Intelligence"));
    books.add(new Book("Python Machine Learning", "Sebastian Raschka, Vahid Mirjalili", 2019, "Artificial Intelligence"));
    books.add(new Book("Deep Learning for Computer Vision with Python", "Adrian Rosebrock", 2017, "Artificial Intelligence"));
    books.add(new Book("AI: A Very Short Introduction", "Margaret A. Boden", 2018, "Artificial Intelligence"));

    books.add(new Book("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin", 2008, "Software Development"));
    books.add(new Book("The Pragmatic Programmer", "Andrew Hunt, David Thomas", 1999, "Software Development"));

}
public int getNumberOfBooks(){
    return books.size();
}
public List<Book> getBooks(){
    System.out.println("Books Serviceee "+books);
    return books;
}
public List<Book> addBook(Book book){
    books.add(book);
    return books;
}
}
