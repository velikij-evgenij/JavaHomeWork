package com.pb.velikij.hw8;

public class OnlineShop {                                                                  //создание класса "Онлайн магазин"

    public static void main(String[] args) {                                               //создание метода "главный"

        Auth User1 = new Auth();                                                           //создание объекта "Пользователь1"

        for (int i=5; i>0;) {                                                              //создание цикла подсчета ошибок
            try {                                                                          //создание обработки исключений
                User1.signUp();                                                            //вызов метода регистрации
                i=0;                                                                       //обнуление счетчика для завершения цикла
            } catch (Auth.WrongLoginException | Auth.WrongPasswordException exSignUp) {    //проверка на определенное исключение
                System.out.println("Для регистрации осталось попыток: " + --i + "\n");     //уменьшение счетчика ошибок
            }
        }

        for (int i=5; i>0;) {                                                              //создание цикла подсчета ошибок
            try {                                                                          //создание обработки исключений
                User1.signIn();                                                            //вызов метода регистрации
                i=0;                                                                       //обнуление счетчика для завершения цикла
            } catch (Auth.WrongLoginException exSignIn) {                                  //проверка на определенное исключение
                System.out.println("Для входа на сайт осталось попыток: " + --i + "\n");   //уменьшение счетчика ошибок
            }
        }
    }
}
