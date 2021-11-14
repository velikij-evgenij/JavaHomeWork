package com.pb.velikij.hw7;

public enum Size {   //создание специального класса (enum-перечисление) "Размер", который хранит константы

    XXS(getDescription("XXS"), getEuroSize("XXS")),   //константа - значение размера
    XS(getDescription("XS"), getEuroSize("XS")),      //константа - значение размера
    S(getDescription("S"), getEuroSize("S")),         //константа - значение размера
    M(getDescription("M"), getEuroSize("M")),         //константа - значение размера
    L(getDescription("L"), getEuroSize("L"));         //константа - значение размера

    private String description;   //создание переменной "описание" (тип строка), которая характеризует константы
    private int euroSize;         //создание переменной "евроразмер" (тип целое число), которая характеризует константы

    Size(String descriptionString, int euroSizeInt) {    //создание конструктора констант с указанием обязательных характеристик
        this.description = descriptionString;            //присвоение переменной введеного значения характеристики константы
        this.euroSize = euroSizeInt;                     //присвоение переменной введеного значения характеристики константы
    }                                                    //окончание конструктора

    static String getDescription(String SizeStringD) {   //создание метода "получить описание" определяющего является размер детским или взрослым
        if (SizeStringD == "XXS") {                      //создание условия проверки равенства введенного размера с значением XXS
            return "Детский размер";                     //если условие выполнилось, возврат соответствующего описания
        } else {                                         //окончание условия и создание действия для невыполнившихся условий
            return "Взрослый размер";                    //если условие НЕ выполнилось, возврат соответствующего описания
        }                                                //окончание действия для невыполнившихся условий
    }                                                    //окончание метода

    static int getEuroSize(String SizeStringE) {         //создание метода "получить евроразмер" возвращающего числовое значение размера
        switch (SizeStringE) {                           //создание проверки соответствия константы и введенного размера
            case "XXS":                                  //проверка соответствия данной константы и введенного размера
                return 32;                               //если условие выполнилось, возврат соответствующего значения
            case "XS":                                   //проверка соответствия данной константы и введенного размера
                return 34;                               //если условие выполнилось, возврат соответствующего значения
            case "S":                                    //проверка соответствия данной константы и введенного размера
                return 36;                               //если условие выполнилось, возврат соответствующего значения
            case "M":                                    //проверка соответствия данной константы и введенного размера
                return 38;                               //если условие выполнилось, возврат соответствующего значения
            case "L":                                    //проверка соответствия данной константы и введенного размера
                return 40;                               //если условие выполнилось, возврат соответствующего значения
            default:                                     //создание действия при НЕ выполнении всех условий
                System.out.println("Размер "+SizeStringE+" не указан в справочнике евроразмеров.");   //вывод сообщения о НЕ выполнении всех условий
        }                                                //окончание проверки соответствия
        return 0;                                        //возврат нулевого значения при НЕ выполнении всех условий
    }                                                    //окончание метода
}                                                        //окончание класса
