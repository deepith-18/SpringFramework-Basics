package com.rc.ex6;

public class Student {

    private int id;
    private String name;
    private Book book;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Setter
    public void setBook(Book book) {
        this.book = book;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Book Price: " + book.getPrice());
    }
}