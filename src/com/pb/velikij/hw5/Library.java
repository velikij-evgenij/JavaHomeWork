package com.pb.velikij.hw5;

public class Library {

    public static void main(String[] args) {

        //Book book = new Book();
        //Reader reader = new Reader();
        Book[] bookArray = new Book[3];
        Reader[] readerArray = new Reader[3];

        for(int i = 0; i < bookArray.length; ++i) {
            System.out.println(bookArray[i].bookInfo());
        }

        for(int i = 0; i < readerArray.length; ++i) {
            System.out.println(readerArray[i].readerInfo());
        }

    }

}
