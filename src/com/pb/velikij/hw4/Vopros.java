package com.pb.velikij.hw4;

public class Vopros {
    public static void main(String[] args) {

        String fraza1 = "Аз есмь строка, живу я, мерой остр.";
        fraza1 = bukvy(fraza1);

        System.out.println(fraza1);
    }

    static String bukvy(String fraza) {
        fraza = fraza.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");;
        System.out.print(fraza);
        return fraza;
    }

}
