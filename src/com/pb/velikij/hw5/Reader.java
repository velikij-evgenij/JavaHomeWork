package com.pb.velikij.hw5;

import javax.xml.soap.Text;

public class Reader {

    private String readerFamily;
    private int readerTicket;
    private String readerFaculty;
    private String readerBirthday;
    private String readerPhone;

    public Reader(String readerFamily, int readerTicket, String readerFaculty, String readerBirthday, String readerPhone) {
        this.readerFamily=readerFamily;
        if (readerTicket > 0) {
            this.readerTicket = readerTicket;
            this.readerFaculty=readerFaculty;
            this.readerBirthday=readerBirthday;
            this.readerPhone=readerPhone;
        }
    }

    public String getReaderFamily() {
        if (readerFamily == null || readerFamily.isEmpty()) {
            System.out.println("Фамилию читателя необходимо указать!");
        }
        return readerFamily;
    }

    public void setReaderFamily(String readerFamily) {
        this.readerFamily = readerFamily;
    }

    public int getReaderTicket() {
        return readerTicket;
    }

    public void setReaderTicket(int readerTicket) {
        this.readerTicket = readerTicket;
    }

    public String getReaderFaculty() {
        return readerFaculty;
    }

    public void setReaderFaculty(String readerFaculty) {
        this.readerFaculty = readerFaculty;
    }

    public String getReaderBirthday() {
        return readerBirthday;
    }

    public void setReaderBirthday(String readerBirthday) {
        this.readerBirthday = readerBirthday;
    }

    public String getReaderPhone() {
        return readerPhone;
    }

    public void setReaderPhone(String readerPhone) {
        this.readerPhone = readerPhone;
    }

    public void takeBook(int bookKolichestvo) {
        System.out.println("\n" + "У " + readerFamily + " количество взятых книг: " + bookKolichestvo);
    }

    public void takeBook(String... bookName) {
        System.out.print(readerFamily + " взял книги:");
        for (String i: bookName) {
            System.out.print(" " + i + ",");
        }
    }

    public void takeBook(Book... books) {
        System.out.println("\n" + readerFamily + " взял книги: ");
        for(Book b: books) {
            System.out.println(b.bookInfo());
        }
    }

    public void returnBook(int bookKolichestvo) {
        System.out.println("\n" + readerFamily + " из взятых книг вернул: " + bookKolichestvo);
    }

    public void returnBook(String... bookName) {
        System.out.print(readerFamily + " вернул книги:");
        for (String i: bookName) {
            System.out.print(" " + i + ",");
        }
    }

    public void returnBook(Book... books) {
        System.out.println("\n" + readerFamily + " взял книги: ");
        for(Book b: books) {
            System.out.println(b.bookInfo());
        }
    }

    String readerInfo() {
        return "Читатель: " + readerFamily + ", номер билета: " + readerTicket + ", факультет: " + readerFaculty + ", дата рождения: " + readerBirthday + ", телефон: " + readerPhone;
    }

}
