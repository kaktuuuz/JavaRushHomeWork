package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n,m;
        List<String> list = new ArrayList<String>();


        n=Integer.parseInt(reader.readLine()); //kol-vo strok
        m=Integer.parseInt(reader.readLine()); //


        for(int i=0;i<n;i++){
            list.add(reader.readLine());
        }
        int i=0;
        while(i <m){
            list.add(list.get(0));
            list.remove(0);
            i++;
        }

        for(String s : list){
            System.out.println(s);
        }

        //Напишите тут ваш код
    }
}
