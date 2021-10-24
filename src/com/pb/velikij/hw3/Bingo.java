package com.pb.velikij.hw3;
import java.util.Random;
import java.util.Scanner;
public class Bingo {
    public static void main(String[] args) {
        System.out.println("Привет. Я игра \"Bingo\".");
        Random random = new Random();
        int x = random.nextInt(101);
        System.out.println("Я загадала целое число в диапазоне от 0 до 100." + "\n" + "Попробуйте угадать это число за 5 попыток.");
        int variant;
        int popytka = 0;
        Scanner variantscan = new Scanner(System.in);

        for (; ;) {
            popytka++;
            System.out.println("Введите Ваш вариант числа и нажмите клавишу \"Ввод\" (если не желаете угадывать, введите число больше 100):");
            variant = variantscan.nextInt();
            if (variant > 100) {
                System.out.println("Вы сдались после " + --popytka + "-й попытки :(. Досвидание.");
                break;
            } else if (variant > x) {
                System.out.println("Число " + variant + " больше задуманого мной!");
                continue;
            } else if (variant < x) {
                System.out.println("Число " + variant + " меньше задуманого мной!");
                continue;
            } else {
                System.out.println("Поздравляю!!! Вы угадали с " + popytka + "-й попытки!");
            }
            break;
        }
    }
}
