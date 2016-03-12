package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Toshiba on 6/28/2015.
 * 1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
 1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

 */
public abstract class Hen
{
abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я курица.";
    }
}
