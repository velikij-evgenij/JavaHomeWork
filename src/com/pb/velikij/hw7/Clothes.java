package com.pb.velikij.hw7;

public abstract class Clothes {   //создание абстрактного класса "Одежда"

    private String name;     //создание переменной "наименование" (тип строка), которая характеризует одежду
    private Size size;       //создание переменной "размер" (тип константы размеров), которая характеризует одежду
    private float price;     //создание переменной "стоимость" (тип число с плавающей точкой), которая характеризует одежду
    private String colour;   //создание переменной "цвет" (тип строка), которая характеризует одежду

    public Clothes(String nameClothes, Size sizeClothes, float priceClothes, String colourClothes) {   //создание конструктора, образец для расширяющих классов
        name = nameClothes;       //присвоение переменной введеного значения характеристики
        size = sizeClothes;       //присвоение переменной введеного значения характеристики
        price = priceClothes;     //присвоение переменной введеного значения характеристики
        colour = colourClothes;   //присвоение переменной введеного значения характеристики
    }                             //окончание конструктора

    public String getName() {                //создание метода "получить переменную" для доступа к переменной класса private
        return name;                         //возврат переменной класса private
    }                                        //окончание метода

    public void setName(String name) {       //создание метода "установить переменную" для доступа к переменной класса private
        this.name = name;                    //присвоение переменной класса private введеного значения характеристики
    }                                        //окончание метода

    public Size getSize() {                  //создание метода "получить переменную" для доступа к переменной класса private
        return size;                         //возврат переменной класса private
    }                                        //окончание метода

    public void setSize(Size size) {         //создание метода "установить переменную" для доступа к переменной класса private
        this.size = size;                    //присвоение переменной класса private введеного значения характеристики
    }                                        //окончание метода

    public float getPrice() {                //создание метода "получить переменную" для доступа к переменной класса private
        return price;                        //возврат переменной класса private
    }                                        //окончание метода

    public void setPrice(float price) {      //создание метода "установить переменную" для доступа к переменной класса private
        this.price = price;                  //присвоение переменной класса private введеного значения характеристики
    }                                        //окончание метода

    public String getColour() {              //создание метода "получить переменную" для доступа к переменной класса private
        return colour;                       //возврат переменной класса private
    }                                        //окончание метода

    public void setColour(String colour) {   //создание метода "установить переменную" для доступа к переменной класса private
        this.colour = colour;                //присвоение переменной класса private введеного значения характеристики
    }                                        //окончание метода

    static class Tshirt extends Clothes {    //создание внутреннего класса "Футболка", расширяющего класс "Одежда"

        public Tshirt(Size sizeTshirt, float priceTshirt, String colourTshirt) {   //создание конструктора расширяющего класса
            super("Футболка", sizeTshirt,priceTshirt,colourTshirt);    //корректировка родительского конструктора
        }                                                                         //окончание конструктора
    }                                        //окончание внутреннего класса

    static class Pants extends Clothes {     //создание внутреннего класса "Штаны", расширяющего класс "Одежда"

        public Pants(Size sizePants, float pricePants, String colourPants) {       //создание конструктора расширяющего класса
            super("Штаны", sizePants,pricePants,colourPants);          //корректировка родительского конструктора
        }                                                                         //окончание конструктора
    }                                        //окончание внутреннего класса

    static class Skirt extends Clothes {     //создание внутреннего класса "Юбка", расширяющего класс "Одежда"

        public Skirt(Size sizeSkirt, float priceSkirt, String colourSkirt) {       //создание конструктора расширяющего класса
            super("Юбка", sizeSkirt,priceSkirt,colourSkirt);           //корректировка родительского конструктора
        }                                                                         //окончание конструктора
    }                                        //окончание внутреннего класса
}
