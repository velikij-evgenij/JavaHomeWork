package com.pb.velikij.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {                                //создание класса "Аутентификация"

    private String login;                          //создание переменной "логин"
    private String password;                       //создание переменной "пароль"

    public String getLogin() {                     //создание методов получения и установки переменных
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signUp() throws WrongLoginException, WrongPasswordException {   //создание метода "зарегистрироваться" с вызовом обработки исключения

        Scanner scanScan = new Scanner(System.in);                              //создание переменной ввода данных пользователем

        System.out.println("Для регистрации на сайте введите Логин." + "\n" +   //вывод сообщения о логине
                "Длинна Логина должна быть от 5 до 20 символов. Вводите только латинские буквы и цифры.");
        String login = scanScan.nextLine();                                     //создание переменной ввода строки и запрос ввода логина
        if (Pattern.matches("[a-zA-Z0-9]{5,20}",login)) {                //создание условия и проверка соответствия логина шаблону
        } else {                                                               //создание действий при отрицательной проверке
            System.out.println("Внимание! Набор символов \"" + login +         //вывод сообщения о некорректном логине
                    "\" не может использоваться в качестве Логина.");
            throw new WrongLoginException ();                                  //вызов метода обработки исключения
        }

        System.out.println("Введите Пароль." + "\n" +                          //вывод сообщения о пароле
                "Длинна Пароля должна быть более 5 символов. Вводите только латинские буквы и цифры и знак подчеркивания.");
        String password = scanScan.nextLine();                                 //создание переменной ввода строки и запрос ввода пароля
        if (Pattern.matches("[a-zA-Z0-9_]{5,}",password)) {             //создание условия и проверка соответствия пароля шаблону
            System.out.println("Введите повторно Пароль.");                   //вывод сообщения о пароле
            String confirmPassword = scanScan.nextLine();                     //создание переменной ввода строки и запрос ввода повторного пароля
            if (confirmPassword.equals(password)) {                           //создание условия и проверка соответствия повторного пароля
                setLogin(login);                                              //сохранение логина после положительной проверки
                setPassword(password);                                        //сохранение пароля после положительной проверки
                System.out.println("Логин и Пароль сохранены." + "\n" +       //вывод сообщения о успешном вводе пароля и регистрации
                        "Регистрация прошла успешно!");
            } else {                                                          //создание действий при отрицательной проверке
                System.out.println("Внимание! Повторно введенный Пароль " +   //вывод сообщения о неправильном пароле
                        "не соответствует первоначальному.");
                throw new WrongPasswordException ();                          //вызов метода обработки исключения
            }
        } else {                                                              //создание действий при отрицательной проверке
            System.out.println("Внимание! Введенный набор символов " +        //вывод сообщения о некорректном пароле
                    "не может использоваться в качестве Пароля.");
            throw new WrongPasswordException ();                              //вызов метода обработки исключения
        }
    }

    public void signIn() throws WrongLoginException {                           //создание метода "зарегистрироваться" с вызовом обработки исключения

        Scanner scanScan = new Scanner(System.in);                              //создание переменной ввода данных пользователем

        System.out.println("Для регистрации на сайте введите Логин." + "\n" +   //вывод сообщения о логине
                "Длинна Логина должна быть от 5 до 20 символов. Вводите только латинские буквы и цифры.");
        String login = scanScan.nextLine();                                     //создание переменной ввода строки и запрос ввода логина
        if (Pattern.matches("[a-zA-Z0-9]{5,20}",login)) {                //создание условия и проверка соответствия логина шаблону
        } else {                                                               //создание действий при отрицательной проверке
            System.out.println("Внимание! Набор символов \"" + login +         //вывод сообщения о некорректном логине
                    "\" не может использоваться в качестве Логина.");
            throw new WrongLoginException ();                                  //вызов метода обработки исключения
        }

        System.out.println("Введите Пароль." + "\n" +                          //вывод сообщения о пароле
                "Длинна Пароля должна быть более 5 символов. Вводите только латинские буквы и цифры и знак подчеркивания.");
        String password = scanScan.nextLine();                                 //создание переменной ввода строки и запрос ввода пароля
        if (Pattern.matches("[a-zA-Z0-9_]{5,}",password)) {             //создание условия и проверка соответствия пароля шаблону
            System.out.println("Введите повторно Пароль.");                   //вывод сообщения о пароле
            String confirmPassword = scanScan.nextLine();                     //создание переменной ввода строки и запрос ввода повторного пароля
            if (confirmPassword.equals(password)) {                           //создание условия и проверка соответствия повторного пароля
                setLogin(login);                                              //сохранение логина после положительной проверки
                setPassword(password);                                        //сохранение пароля после положительной проверки
                System.out.println("Логин и Пароль сохранены." + "\n" +       //вывод сообщения о успешном вводе пароля и регистрации
                        "Регистрация прошла успешно!");
            } else {                                                          //создание действий при отрицательной проверке
                System.out.println("Внимание! Повторно введенный Пароль " +   //вывод сообщения о неправильном пароле
                        "не соответствует первоначальному.");
                throw new WrongLoginException ();                             //вызов метода обработки исключения
            }
        } else {                                                              //создание действий при отрицательной проверке
            System.out.println("Внимание! Введенный набор символов " +        //вывод сообщения о некорректном пароле
                    "не может использоваться в качестве Пароля.");
            throw new WrongLoginException ();                                 //вызов метода обработки исключения
        }
    }

    public class WrongLoginException extends Exception {                      //создание класса обработки исключения

        public WrongLoginException() {                                        //создание конструктора без ввода данных
        }

        public WrongLoginException(String message) {                          //создание конструктора с вводом сообщения
            super(message);
        }
    }

    public class WrongPasswordException extends Exception {                      //создание класса обработки исключения

        public WrongPasswordException() {                                        //создание конструктора без ввода данных
        }

        public WrongPasswordException(String message) {                          //создание конструктора с вводом сообщения
            super(message);
        }
    }
}
