package com.pb.velikij.hw6;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(olfactorySensitivity, dog.olfactorySensitivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(olfactorySensitivity);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "olfactorySensitivity='" + olfactorySensitivity + '\'' +
                '}';
    }
}
