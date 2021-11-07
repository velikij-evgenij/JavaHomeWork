package com.pb.velikij.hw6;

public class Dog extends Animal {

    private String olfactorySensitivity;

    public Dog (String olfactorySensitivityDog) {
        super("Собака", "собачий корм", "домашняя");
        this.olfactorySensitivity=olfactorySensitivityDog;
    }

    @Override
    public void makeNoise() {
        System.out.println(getType() + " лает.");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " ест " + getFood() + ".");
    }
}
