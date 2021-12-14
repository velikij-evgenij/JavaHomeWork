package com.pb.velikij.hw9;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class FileNumbers {                                                                                      //создание класса "Файл чисел"

    public static void main(String[] args) {

        createNumbersFile();
        createOddNumbersFile();

    }

    public static void createNumbersFile() {                                                                      //создание метода "числа файла"

        Path fileWithNumbers = Paths.get("C:\\Users\\Дом\\Desktop\\Java\\files\\numbers.txt");
        Random random = new Random();
        int x;

        try (BufferedWriter writingPen = Files.newBufferedWriter(fileWithNumbers)) {
            for (int j=10; j>0; --j) {
                String y ="";
                for (int i=10; i>0; --i) {
                    x = random.nextInt(99)+1;
                    y=y+x+" ";
                }
                System.out.println(y);
                writingPen.write(y);
                writingPen.newLine();
            }
        } catch (Exception ex) {
            System.out.println("При записи данных в файл возникла ошибка: " + ex);
        }
        System.out.println("Вышеизложенные строки с числами были успешно записаны в файл: " + fileWithNumbers + "\n");
    }

    public static void createOddNumbersFile() {                                                                 //создание метода "нечетные числа файла"

        Path fileWithNumbers = Paths.get("C:\\Users\\Дом\\Desktop\\Java\\files\\numbers.txt");
        try (BufferedReader readingEye = Files.newBufferedReader(fileWithNumbers)) {

            String tenNumbers;
            while((tenNumbers = readingEye.readLine()) != null) {
                System.out.println(tenNumbers);
            }
            System.out.println();
        } catch (Exception ex) {
            System.out.println("При считывании данных с файла произошла ошибка: " + ex);
        }


        Path fileWithOddNumbers = Paths.get("C:\\Users\\Дом\\Desktop\\Java\\files\\odd-numbers.txt.txt");
        Random random = new Random();
        int x;

        try (BufferedWriter writingPen = Files.newBufferedWriter(fileWithOddNumbers)) {
            for (int j=10; j>0; --j) {
                String y ="";
                for (int i=10; i>0; --i) {
                    x = random.nextInt(99)+1;
                    y=y+x+" ";
                }
                System.out.println(y);
                writingPen.write(y);
                writingPen.newLine();
            }
        } catch (Exception ex) {
            System.out.println("При записи данных в файл возникла ошибка: " + ex);
        }
        System.out.println("Вышеизложенные строки с числами были успешно записаны в файл: " + fileWithOddNumbers);
    }
}
