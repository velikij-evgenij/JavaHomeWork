package com.pb.velikij.hw2;
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {
        int operand1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа 'Интервал'");
        System.out.println("Введите целое число");
        operand1 = scan.nextInt();

        if (operand1 <= 14) {
            if (operand1 >= 0) {
                System.out.print("Число "+operand1+" попадает в промежуток [0-14]");
            } else {
                System.out.print("Число "+operand1+" не попадает в один из промежутков [0-14], [15-35], [36-50], [51-100]");
            }
        } else if (operand1 <= 35) {
            System.out.print("Число "+operand1+" попадает в промежуток [15-35]");
        } else if (operand1 <= 50)  {
            System.out.print("Число "+operand1+" попадает в промежуток [36-50]");
        } else if (operand1 <= 100) {
            System.out.print("Число "+operand1+" попадает в промежуток [51-100]");
        } else {
            System.out.print("Число "+operand1+" не попадает в один из промежутков [0-14], [15-35], [36-50], [51-100]");
        }
    }
}
