package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> l = new ArrayList<String>();
        for(int i=0; i<5; i++){
            l.add(reader.readLine());
        }
        for(int i=4;i>=0;i--){

            System.out.println(l.get(i));
        }
        //Напишите тут ваш код

    }
}
