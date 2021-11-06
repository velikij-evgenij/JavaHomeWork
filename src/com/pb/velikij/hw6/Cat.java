package com.pb.velikij.hw6;

public class Cat extends Animal {

    @Override
    public void makeNoise(String animalType) {
        System.out.println("Кошка мяукает.");
    }

    @Override
    public void eat(String animalType) {
        System.out.println("Кошка ест кошачий корм.");
    }
}
