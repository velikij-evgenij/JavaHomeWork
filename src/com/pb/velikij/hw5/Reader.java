package com.pb.velikij.hw5;

public class Reader {

    String readerFamily;
    int readerTicket;
    String readerFaculty;
    String readerBirthday;
    String readerPhone;

    String readerInfo() {
        return "Читатель: " + readerFamily + ", номер билета: " + readerTicket + ", факультет: " + readerFaculty + ", дата рождения: " + readerBirthday + ", телефон: " + readerPhone;
    }

}
