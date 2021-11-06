package com.pb.velikij.hw6;

public class Dog extends Animal {

    @Override
    public void makeNoise(String animalType) {
        System.out.println("Собака лает.");
    }

    @Override
    public void eat(String animalType) {
        System.out.println("Собака ест собачий корм.");
    }
}
