package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];//20
        for (int i = 0; i < array.length; i++)
        {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }


    //System.out.println(isGreaterThen("a","b"));  //false
    //System.out.println(isGreaterThen("b","a")); //true




    }





    public static void sort(String[] array)
    {
        boolean b=true;
while(b){
    b=false;

       for(int i=0; i<array.length-1;i++){
          if (isGreaterThen(array[i],array[i+1])){
               String tmp = array[i+1];
               array[i+1]=array[i];
               array[i]=tmp;
               b=true;
           }

           }
       }
    }
        //Напишите тут ваш код


    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
