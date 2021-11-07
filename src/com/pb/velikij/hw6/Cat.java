package com.pb.velikij.hw6;

public class Cat extends Animal {

    private String nightVision;

    public Cat (String nightVisionCat) {
        super("Кот", "кошачий корм", "домашний");
        this.nightVision=nightVisionCat;
    }

    @Override
    public void makeNoise() {
        System.out.println(getType() + " мяукает.");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " ест " + getFood() + ".");
    }
}
