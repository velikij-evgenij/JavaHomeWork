package com.pb.velikij.hw7;

public interface ManClothes {   //создание интерфейса "Мужская одежда"

    static void dressMan(Clothes clothesType) {   //создание метода "одеть мужчину", выводит информацию об одежде

        System.out.println("Мужская одежда: " + clothesType.getName() + ", размер " + clothesType.getSize() + ", евроразмер " +       //информация о наименовании и размере
                Size.getEuroSize(clothesType.getSize().toString()) + " (" + Size.getDescription(clothesType.getSize().toString()) +   //информация о евроразмере и описание размера
                "), цена " + clothesType.getPrice() + ", цвет " + clothesType.getColour());                                           //информация о цене и цвете
    }                                             //окончание метода
}
