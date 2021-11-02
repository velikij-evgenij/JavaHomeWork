package com.pb.velikij.hw5;

public class Reader {

    private String readerFamily;
    private int readerTicket;
    private String readerFaculty;
    private String readerBirthday;
    private String readerPhone;

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

    int n = 3;
    public void takeBook(String readerFamily) {
        System.out.println(readerFamily + " взял " + n +" книги.");
    }

    String readerInfo() {
        return "Читатель: " + readerFamily + ", номер билета: " + readerTicket + ", факультет: " + readerFaculty + ", дата рождения: " + readerBirthday + ", телефон: " + readerPhone;
    }

}
