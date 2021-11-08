package com.pb.velikij.hw5;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book("Приключения", "Иванов И. И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А. В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);

        Reader reader1 = new Reader("Петров В. В.", 1001, "литературный", "1 января 1980", "0501234567");
        Reader reader2 = new Reader("Великий Е. П.", 1007, "финансовый", "6 января 1982", "0980166222");
        Reader reader3 = new Reader("Быстров А. В.", 1009, "информатики", "9 января 1984", "0959191999");

        System.out.println("Перечень всех книг:");
        System.out.println(book1.bookInfo());
        System.out.println(book2.bookInfo());
        System.out.println(book3.bookInfo());

        System.out.println("\n" + "Перечень всех читателей:");
        System.out.println(reader1.readerInfo());
        System.out.println(reader2.readerInfo());
        System.out.println(reader3.readerInfo());

        reader1.takeBook(3);
        reader1.takeBook(book1.getBookName(), book2.getBookName(), book3.getBookName());
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook(book1.getBookName(), book2.getBookName(), book3.getBookName());
        reader1.returnBook(book1, book2, book3);

        reader2.takeBook(2);
        reader2.takeBook(book1.getBookName(), book2.getBookName());
        reader2.takeBook(book1, book2);

        reader2.returnBook(2);
        reader2.returnBook(book1.getBookName(), book2.getBookName());
        reader2.returnBook(book1, book2);

        reader3.takeBook(1);
        reader3.takeBook(book1.getBookName());
        reader3.takeBook(book1);

        reader3.returnBook(1);
        reader3.returnBook(book1.getBookName());
        reader3.returnBook(book1);
    }
}
