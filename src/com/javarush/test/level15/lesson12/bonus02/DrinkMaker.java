package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by Toshiba on 26.09.2015.
 */
abstract public class DrinkMaker
{
    abstract void getRightCup();
    abstract  void putIngredient();
    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();

    }

}
