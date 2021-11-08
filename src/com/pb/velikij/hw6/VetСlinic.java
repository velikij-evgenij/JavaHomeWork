package com.pb.velikij.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {

    public static void main(String[] args) throws Exception {

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

        Animal Cat2 = new Cat("хорошее");
        System.out.println("eq Cat1 Cat2: " + Cat1.equals(Cat2));

        System.out.println("hashCode Cat1: " + Cat1.hashCode());
        System.out.println("hashCode Cat2: " + Cat2.hashCode());
        System.out.println("hashCode Dog1: " + Dog1.hashCode());
        System.out.println("hashCode Horse1: " + Horse1.hashCode());

        System.out.println(Cat1);

        Class clazz = Cat1.getClass();
        System.out.println(clazz.getName());
        System.out.println(Arrays.toString(clazz.getMethods()));

        Class veterinarianClazz = Class.forName("com.pb.velikij.hw6.Veterinarian");
        Constructor veterinarianConstr = veterinarianClazz.getConstructor(new Class[] {});
        Object veterinarianObj = veterinarianConstr.newInstance();
        if (veterinarianObj instanceof Veterinarian) {
            ((Veterinarian) veterinarianObj).treatAnimal(Cat2);
        }
    }
}
