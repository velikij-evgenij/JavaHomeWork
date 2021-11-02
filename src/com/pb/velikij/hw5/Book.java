package com.pb.velikij.hw5;

public class Book {

    private String bookName;
    private String bookAvtor;
    private int bookYear;

    public String getBookName() {
        if (bookName == null || bookName.isEmpty()) {
            System.out.println("Название книги необходимо указать!");
        }
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAvtor() {
        return bookAvtor;
    }

    public void setBookAvtor(String bookAvtor) {
        this.bookAvtor = bookAvtor;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    String bookInfo() {
        return "Книга: " + bookName + ", автор: " + bookAvtor + ", год издания: " + bookYear;
    }

}
