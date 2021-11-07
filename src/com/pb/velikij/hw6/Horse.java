package com.pb.velikij.hw6;

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
}
