package com.pb.velikij.hw7;

import com.pb.velikij.hw6.Animal;

import java.util.Arrays;

public class Atelier {

    public static void main(String[] args) {

        Clothes.Tshirt Tshirt1 = new Clothes.Tshirt(Size.XXS, 125, "белый");
        Clothes.Pants Pants1 = new Clothes.Pants(Size.S, 455, "черный");
        Clothes.Skirt Skirt1 = new Clothes.Skirt(Size.L, 345, "синий");
        Clothes.Tie Tie1 = new Clothes.Tie(Size.M, 22,"зеленый");

        Clothes[] clothesArray = new Clothes[] {Tshirt1, Pants1, Skirt1, Tie1};

        public void dressMan(Clothes[] clothesArray) {

            Object obj = clothesArray;
            if (obj instanceof dressMan) {
                obj.dressMan;
            }
        }
    }
}
