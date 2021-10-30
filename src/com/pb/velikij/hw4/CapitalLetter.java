package com.pb.velikij.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {

        System.out.println("Привет. Я программа \"Заглавная буква\". Я пишу все слова с заглавной буквы" + "\n" + "Введите предложение:");
        Scanner scanpredlozh = new Scanner(System.in);
        String predlozh = scanpredlozh.nextLine();

        String[] arraypredlozh = predlozh.split(" ");

        for(String i:arraypredlozh) {
            zaglav(i);
        }
    }
    static void zaglav(String slovo) {
        String pervaya = slovo.substring(0,1);
        String other = slovo.substring(1);
        System.out.print(pervaya.toUpperCase()+other+" ");
    }
}
