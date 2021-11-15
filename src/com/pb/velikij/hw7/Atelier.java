package com.pb.velikij.hw7;

import java.util.Arrays;

public class Atelier {

    public static void main(String[] args) {


        Size.L.getEuroSize("LO");

        Clothes.Tshirt Tshirt1 = new Clothes.Tshirt(Size.XXS, 125, "белый");
        Tshirt1.dressMan();

        Clothes.Tshirt Tshirt2 = new Clothes.Tshirt(Size.S, 455, "черный");
        Tshirt2.dressWomen();

        Clothes.Tie Tie1 = new Clothes.Tie(Size.M, 22,"dsa");
        Tie1.dressWomen();

        Clothes.Skirt Skirt1 = new Clothes.Skirt(Size.L, 345, "апмва");
        Skirt1.dressMan();

        }

    }
