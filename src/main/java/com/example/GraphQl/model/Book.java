package com.example.GraphQl.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String name;
    private String author;
    private int year;
    private String category;

}
