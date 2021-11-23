package com.pb.velikij.hw9;

import java.io.*;
import java.nio.file.*;

public class FileNumbers {
    private Path path;                                                                  //создание класса "Файл "Числа"

    public static void main(String[] args) {

        createNumbersFile();


    }

    public static void createNumbersFile() {   //создание метода "создание файла "Числа"

        Path fileUser = Paths.get("C:\\Users\\schoo\\Desktop\\java\\files\\numbers.txt");

        try (BufferedWriter writingPen = Files.newBufferedWriter(fileUser)) {
            writingPen.write("34 65 78 94 2 61 9 33 92 1");
            writingPen.newLine();
            writingPen.write("45 78 12 1 56 65 3 9 56 11");
        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + fileUser + "\" done!");
    }

}
