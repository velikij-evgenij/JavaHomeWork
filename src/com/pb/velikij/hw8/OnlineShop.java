package com.pb.velikij.hw8;

public class OnlineShop {

    public static void main(String[] args) {

        Auth Auth1 = new Auth();

        for (int i=5; i>0;) {
            try {
                Auth1.signUp();
                i=0;
            } catch (Auth.WrongLoginException e) {
                System.out.println("Осталось попыток: " + --i);
            }
        }
    }
}
