package com.pb.velikij.hw9;

import java.io.*;
import java.nio.file.*;
import java.util.Random;

public class FileNumbers {                                                                                      //создание класса "Файл чисел"

    public static void main(String[] args) {

        createNumbersFile();
        createOddNumbersFile();

    }

    public static void createNumbersFile() {                                                                    //создание метода "числа файла"

        Path fileUser = Paths.get("C:\\Users\\schoo\\Desktop\\java\\files\\numbers.txt");
        Random random = new Random();
        int x;

        try (BufferedWriter writingPen = Files.newBufferedWriter(fileUser)) {
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
        System.out.println("Вышеизложенные строки с числами были успешно записаны в файл: " + fileUser + "\n");
    }

    public static void createOddNumbersFile() {                                                                 //создание метода "нечетные числа файла"

        Path fileUser = Paths.get("C:\\Users\\schoo\\Desktop\\java\\files\\odd-numbers.txt.txt");
        Random random = new Random();
        int x;

        try (BufferedWriter writingPen = Files.newBufferedWriter(fileUser)) {
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
        System.out.println("Вышеизложенные строки с числами были успешно записаны в файл: " + fileUser);
    }
}
