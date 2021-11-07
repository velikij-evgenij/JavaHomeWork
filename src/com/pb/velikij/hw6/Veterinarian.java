package com.pb.velikij.hw6;

public class Veterinarian {

    public static void treatAnimal(Animal animalType) {
        System.out.println(animalType.getType() + " " + animalType.getLocation() + ", ест " + animalType.getFood() + ".");
    }
}
