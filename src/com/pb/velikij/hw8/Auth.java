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

    public void signUp() {                                                     //создание метода "зарегистрироваться"

        System.out.println("Для регистрации на сайте введите Логин." + "\n" +   //вывод сообщения о логине
                "Длинна Логина должна быть от 5 до 20 символов." + "\n" +
                "Логин должен содержать только латинские буквы и цифры.");

        Scanner scanLogin = new Scanner(System.in);                             //запрос ввода логина
        String newLogin = scanLogin.nextLine();
        if (Pattern.matches("[a-zA-Z0-9]{5,20}",newLogin)) {       //проверка логина на соответствие шаблону
            setLogin(newLogin);
            System.out.println("Ваш Логин: " + getLogin() + "\n" +
                    "Введите пароль.");
        } else {
            System.out.println("Логин не соответствует требованиям.");
        }
    }

    public class WrongLoginException extends Exception {

        public WrongLoginException() {
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }
}
