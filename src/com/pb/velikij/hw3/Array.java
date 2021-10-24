package com.pb.velikij.hw3;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        System.out.println("Вас приветствует программа \"Array\".");
        int[] array = new int[10];
        System.out.println("Введите 10-ть целых чисел (числа могут быть положительные и отрицательные):");
        Scanner scanArray = new Scanner(System.in);

        for (int index = 0; index < 10; ++index) {
            System.out.println("Введите "+ ++index +"-е число и нажмите клавишу \"Ввод\":");
            array[--index] = scanArray.nextInt();
        }

        System.out.print("Вы ввели: ");
        for (int index = 0; index < 10; ++index) {
            System.out.print(array[index] +"; ");
        }

        int summa=0;
        for (int index = 0; index < 10; ++index) {
        summa += array[index];
        }
        System.out.println("\nСумма Ваших чисел: "+summa);

        int polozh=0;
        for (int index = 0; index < 10; ++index) {
            if (array[index]>0) {
                polozh++;
            }
        }
        System.out.println("Количество положительных чисел: "+polozh);

        System.out.print("Сортирую от меньшего к большему: ");
        int arraymax, arraymin;
        for (int index2 = 0; index2 < 9; ++index2) {
            for (int index = 0; index < 9; ++index) {
                if (array[index]>array[index+1]) {
                    arraymax=array[index]; arraymin=array[index+1];
                    array[index]=arraymin; array[index+1]=arraymax;
                }
            }
        }
        for (int index = 0; index < 10; ++index) {
            System.out.println(array[index] +"; ");
        }
    }
}
