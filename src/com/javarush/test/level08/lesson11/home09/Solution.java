package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("FEBRUARY 1 2000"));

    }

    public static boolean isDateOdd(String date)
    {
        boolean isPair=true;
        Date d1= new Date(date);
        Date d2 = new Date(date);
        d2.setDate(0);
        d2.setMonth(0);



        long days=(d1.getTime()-d2.getTime())/(1000*60*60*24);
        //System.out.println(" Sutok = "+days);
        if(days%2==0){isPair=false;}


        return isPair;
    }
}
