package com.pb.velikij.hw7;

public class Atelier {                         //создание класса "Ателье"

    public static void main(String[] args) {   //создание метода "главный"

        Clothes.Tshirt Tshirt1 = new Clothes.Tshirt(Size.XXS, 175, "белый");    //создание объекта "Футболка"
        Clothes.Pants Pants1 = new Clothes.Pants(Size.S, 455, "черный");       //создание объекта "Штаны"
        Clothes.Skirt Skirt1 = new Clothes.Skirt(Size.L, 341, "синий");         //создание объекта "Юбка"
        Clothes.Tie Tie1 = new Clothes.Tie(Size.M, 72,"зеленый");                //создание объекта "Галстук"

        Clothes[] clothesArray = new Clothes[] {Tshirt1, Pants1, Skirt1, Tie1};                  //создание массива "Одежда"

        dressManArray(clothesArray);                     //выбор мужской одежды с массива с помощью метода "массив одеть мужчину"
        System.out.println();                            //вывод пустой строки для разделения двух выборок
        dressWomenArray(clothesArray);                   //выбор женской одежды с массива с помощью метода "массив одеть женщину"
    }

    static void dressManArray(Clothes[] nameArray) {     //создание метода "массив одеть мужчину" выбирающего мужскую одежду
        for (Clothes i: nameArray) {                     //создание цыкла просмотра всех элементов массива
            if (i instanceof ManClothes) {               //создание условия проверки принадлежности элемента массива к заданому типу
                ((ManClothes) i).dressMan();             //если условие выполнилось, выполнение соответствующего метода
            }                                            //окончание условия
        }                                                //окончание цикла
    }                                                    //окончание метода

    static void dressWomenArray(Clothes[] nameArray) {   //создание метода "массив одеть женщину" выбирающего женскую одежду
        for (Clothes i: nameArray) {                     //создание цыкла просмотра всех элементов массива
            if (i instanceof WomenClothes) {             //создание условия проверки принадлежности элемента массива к заданому типу
                ((WomenClothes) i).dressWomen();         //если условие выполнилось, выполнение соответствующего метода
            }                                            //окончание условия
        }                                                //окончание цикла
    }                                                    //окончание метода
}                                                        //окончание класса
