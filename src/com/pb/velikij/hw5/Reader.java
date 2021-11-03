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

    //public void takeBook(Text... bookAvtors) {
    //    System.out.print("\n" + readerFamily + " взял книги:");
    //    for (Text i: bookAvtors) {
     //       System.out.print(" " + i + ",");
     //   }
    //}

    //public void takeBook(int... getBookYears) {
    //    System.out.print("\n" + readerFamily + " взял книги:");
    //    for (int i: getBookYears) {
    //        System.out.print(" " + i + ",");
    //    }
    //}



    public void takeBook(String... getBookAvtors) {
        System.out.print(readerFamily + " взял книги:");
        for (String i: getBookAvtors) {
            System.out.print(" " + i + ",");
        }
    }

    public void takeBook(String getBookAvtors) {
        System.out.println("\n" + readerFamily + " взял книги: " + getBookAvtors);
            }


    public void returnBook(int bookKolichestvo) {
        System.out.println("\n" + readerFamily + " из взятых книг вернул: " + bookKolichestvo);
    }

    public void returnBook(String... getBookAvtors) {
        System.out.print(readerFamily + " вернул книги:");
        for (String i: getBookAvtors) {
            System.out.print(" " + i + ",");
        }
    }

    public void returnBook(String getBookAvtors) {
        System.out.println("\n" + readerFamily + " вернул книги: " + getBookAvtors);
    }



    //public void takeBook(String i) {
    //    System.out.print("\n" + readerFamily + " взял книги: " + BookName(i) + " (" + "1" + " " + "bookYea" + " г.");

    //}

    String readerInfo() {
        return "Читатель: " + readerFamily + ", номер билета: " + readerTicket + ", факультет: " + readerFaculty + ", дата рождения: " + readerBirthday + ", телефон: " + readerPhone;
    }

}
