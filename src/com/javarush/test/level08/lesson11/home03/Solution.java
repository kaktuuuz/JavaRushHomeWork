package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        //напишите тут ваш код
        Map<String, String> all = new HashMap<String, String>();

        all.put("Familiya1","Imya1");
        all.put("Familiya1","Imya12");
        all.put("Familiya3","Imya12");
        all.put("Familiya4","Imya1");
        all.put("Familiya5","Imya15");
        all.put("Familiya6","Imya16");
        all.put("Familiya7","Imya17");
        all.put("Familiya8","Imya18");
        all.put("Familiya9","Imya1");
        all.put("Familiya10","Imya1");

        return all;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
