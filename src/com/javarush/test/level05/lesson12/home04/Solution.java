package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/


import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.*;

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        //Date today = new Date( );

       Calendar calendar= Calendar.getInstance();
        String month, day;

        if(calendar.get(Calendar.MONTH) <9) {month="0"+(calendar.get(Calendar.MONTH)+1);}
        else month=String.valueOf(calendar.get(Calendar.MONTH)+1);

        if(calendar.get(Calendar.DAY_OF_MONTH) < 10) {day="0"+calendar.get(Calendar.DAY_OF_MONTH);}
        else day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));


        System.out.println( day+" "+month+" "+calendar.get(Calendar.YEAR));

    }
}
