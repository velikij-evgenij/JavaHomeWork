package com.pb.velikij.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(nightVision, cat.nightVision);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nightVision);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nightVision='" + nightVision + '\'' +
                '}';
    }
}
