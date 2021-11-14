package com.pb.velikij.hw7;

public abstract class Clothes {   //создание абстрактного класса "Одежда"

    private String name;     //создание переменной "наименование" (тип строка), которая характеризует одежду
    private Size size;       //создание переменной "размер" (тип константы размеров), которая характеризует одежду
    private float price;     //создание переменной "стоимость" (тип число с плавающей точкой), которая характеризует одежду
    private String colour;   //создание переменной "цвет" (тип строка), которая характеризует одежду

    public Clothes(String nameClothes, Size sizeClothes, float priceClothes, String colourClothes) {
        this.name = nameClothes;
        this.size = sizeClothes;
        this.price = priceClothes;
        this.colour = colourClothes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    static class Tshirt extends Clothes {   //создание класса "Футболка", расширяющего класс "Одежда"

        public Tshirt(Size sizeTshirt, float priceTshirt, String colourTshirt) {
            super("Футболка", sizeTshirt,priceTshirt,colourTshirt);
        }
    }

}
