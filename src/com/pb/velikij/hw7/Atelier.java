package com.pb.velikij.hw7;

import java.util.Arrays;

public class Atelier {

    public static void main(String[] args) {


        Size.L.getEuroSize("LO");

        Clothes.Tshirt Tshirt1 = new Clothes.Tshirt(Size.XXS, 125, "белый");
        ManClothes.dressMan(Tshirt1);

        Clothes.Tshirt Tshirt2 = new Clothes.Tshirt(Size.S, 455, "ert");
        ManClothes.dressMan(Tshirt2);

        Clothes.Tshirt Tshirt3 = new Clothes.Tshirt(Size.M, 22,"dsa");
        ManClothes.dressMan(Tshirt3);

        Clothes.Tshirt Tshirt4 = new Clothes.Tshirt(Size.L, 345, "апмва");
        ManClothes.dressMan(Tshirt4);

        }

    }
