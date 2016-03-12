package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Toshiba on 6/28/2015.
 * 6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
 Методы должны возвращать количество яиц в месяц от данного типа куриц.

 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 Методы должны возвращать строку вида:
 <getDescription() родительского класса>  + <" Моя страна - SSSSS. Я несу N яиц в месяц.">
 где SSSSS - название страны
 где N - количество яиц в месяц
 */
public class RussianHen extends Hen
{
    public String country= Country.RUSSIA;
    @Override
    int getCountOfEggsPerMonth()
    {
        return 25;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()+" Моя страна - "+this.country+". Я несу "+this.getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
