package com.rc.ex6;

public class Book {

    private String bookName;
    private double price;

    public Book(String bookName, double price) {
        this.bookName = bookName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }
}