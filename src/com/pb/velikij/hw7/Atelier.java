package com.pb.velikij.hw7;

import java.util.Arrays;

public class Atelier {

    public static void main(String[] args) {



        //Size.L.getEuroSizePr("NLN");

        Size.L.getEuroSize("LO");

        //ManClothes.dressMan();

        Clothes.Tshirt Tshirt1 = new Clothes.Tshirt(Size.S, 125, "белый");

        ManClothes.dressMan(Tshirt1);

        }

    }
