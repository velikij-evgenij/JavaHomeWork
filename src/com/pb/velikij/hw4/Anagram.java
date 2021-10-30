package com.pb.velikij.hw4;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        System.out.println("Привет. Я программа \"Анаграмма\". Я проверяю являются ли две фразы анаграммами.");
        Scanner scanpredlozh = new Scanner(System.in);
        System.out.println("Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы." + "\n" + "Введите первую фразу или слово:");
        String fraza1 = scanpredlozh.nextLine();
        System.out.println("Введите вторую фразу или слово:");
        String fraza2 = scanpredlozh.nextLine();

        fraza1 = fraza1.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");
        fraza2 = fraza2.replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");

        char[] arrayfraza1 = fraza1.toLowerCase().toCharArray();
        char[] arrayfraza2 = fraza2.toLowerCase().toCharArray();

        sorted(arrayfraza1);
        sorted(arrayfraza2);

        if (arrayfraza1.length == arrayfraza2.length) {
            for(int i = 0; i < arrayfraza1.length; ++i) {
                if (arrayfraza1[i] == arrayfraza2[i]) {
                    if (i == arrayfraza1.length-1) {
                        System.out.println("Эти фразы являются анаграммами.");
                    }
                } else {
                    System.out.println("Эти фразы НЕ являются анаграммами.");
                    break;
                }
            }
        } else {
            System.out.println("Эти фразы НЕ являются анаграммами.");
        }
    }

    static void sorted(char[] arrayfraza) {
        char arraymax, arraymin;
        for (int index2 = 0; index2 < arrayfraza.length-1; ++index2) {
            for (int index = 0; index < arrayfraza.length-1; ++index) {
                if (arrayfraza[index]>arrayfraza[index+1]) {
                    arraymax=arrayfraza[index]; arraymin=arrayfraza[index+1];
                    arrayfraza[index]=arraymin; arrayfraza[index+1]=arraymax;
                }
            }
        }
    }

}
