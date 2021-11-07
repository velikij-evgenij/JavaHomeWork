package com.pb.velikij.hw6;

public class Animal {

    private String food;
    private String location;
    private String type;

    public Animal (String typeAnimal, String foodAnimal, String locationAnimal) {
        this.type=typeAnimal;
        this.food=foodAnimal;
        this.location=locationAnimal;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public void makeNoise() {
        System.out.println(type + " шумит.");
    }

    public void eat() {
        System.out.println(type + " ест.");
    }

    public void sleep() {
        System.out.println(type + " спит.");
    }
}
