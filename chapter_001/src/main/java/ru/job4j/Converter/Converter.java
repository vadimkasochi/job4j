package ru.job4j.Converter;

/**
 * Корвертор валюты.
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return Рубли.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }


    /**
     * Конвертируем рубли в доллары.
     * @param value Рубли.
     * @return Доллары
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value доллары.
     * @return Рубли
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }



}



