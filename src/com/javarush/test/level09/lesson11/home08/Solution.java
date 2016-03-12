package com.javarush.test.level09.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] i1 = {1,2,3,4,5};
        int[] i2= {11,12};
        int[] i3 = {21,22,23,24};
        int[] i4 = {31,32,33,34,35,36,37};
        int[] i5 = {};

        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(i1);
        arrayList.add(i2);
        arrayList.add(i3);
        arrayList.add(i4);
        arrayList.add(i5);
        //Написать тут ваш код
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
