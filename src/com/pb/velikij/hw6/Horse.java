package com.pb.velikij.hw6;

import java.util.Objects;

public class Horse extends Animal {

    private String agility;

    public Horse (String agilityHorse) {
        super("Лошадь", "траву", "сельская");
        this.agility=agilityHorse;
    }

    @Override
    public void makeNoise() {
        System.out.println(getType() + " ржет.");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " ест " + getFood() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(agility, horse.agility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agility);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "agility='" + agility + '\'' +
                '}';
    }
}
