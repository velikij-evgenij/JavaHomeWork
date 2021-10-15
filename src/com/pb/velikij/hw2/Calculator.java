package com.pb.velikij.hw2;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1;
        int operand2;
        String sign; // + - * /
        Scanner scan = new Scanner(System.in);
        System.out.println("Программа 'Калькулятор'");
        System.out.println("Введите первое целое число");
        operand1 = scan.nextInt();
        System.out.println("Введите один из четырех знаков арифметической операции: +  -  *  /");
        sign = scan.next();
        System.out.println("Введите второе целое число");
        operand2 = scan.nextInt();

        switch (sign) {
            case "+" :
                System.out.println(operand1+sign+operand2+"="+(operand1+operand2));
                break;
            case "-" :
                System.out.println(operand1+sign+operand2+"="+(operand1-operand2));
                break;
            case "*" :
                System.out.println(operand1+sign+operand2+"="+(operand1*operand2));
                break;
            case "/" :
                if (operand2==0) {
                    System.out.print("Деление на ноль невозможно!");
                } else {
                    System.out.println(operand1+sign+operand2+"="+(operand1/operand2)+","+((operand1%operand2)*10/operand2));
                }
                break;
            default:
                System.out.println("Введен неправильный знак арифметической операции");
        }

    }
}
