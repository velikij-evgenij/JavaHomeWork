package com.pb.velikij.hw6;

public class VetСlinic {

    public static void main(String[] args) {

        Animal Cat1 = new Cat("хорошее");
        Animal Dog1 = new Dog ("отличное");
        Animal Horse1 = new Horse ("среднее");

        Cat1.makeNoise();
        Dog1.eat();
        Horse1.sleep();


        Animal[] animalArray = new Animal[] {Cat1, Dog1, Horse1};
        for (Animal i: animalArray) {
            Veterinarian.treatAnimal(i);
        }
    }
}
