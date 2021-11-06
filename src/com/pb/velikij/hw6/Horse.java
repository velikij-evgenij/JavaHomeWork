package com.pb.velikij.hw6;

public class Horse extends Animal {

    @Override
    public void makeNoise(String animalType) {
        System.out.println("Лошадь ржет.");
    }

    @Override
    public void eat(String animalType) {
        System.out.println("Лошадь ест траву.");
    }
}
