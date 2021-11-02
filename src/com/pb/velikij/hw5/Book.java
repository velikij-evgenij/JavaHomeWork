package com.pb.velikij.hw5;

public class Book {

    String bookName;
    String bookAvtor;
    int bookYear;

    String bookInfo() {
        return "Книга: " + bookName + ", автор: " + bookAvtor + ", год издания: " + bookYear;
    }

}
