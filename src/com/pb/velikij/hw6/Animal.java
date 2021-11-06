package com.pb.velikij.hw6;

public class Animal {

    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(String animalType) {
        System.out.println(animalType + " шумит.");
    }

    public void eat(String animalType) {
        System.out.println(animalType + " ест.");
    }

    public void sleep(String animalType) {
        System.out.println(animalType + " спит.");
    }
}
