package com.pb.velikij.hw4;
import java.io.BufferedReader;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
