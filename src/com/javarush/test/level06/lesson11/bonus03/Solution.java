package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        //create new arrayList

        ArrayList<Integer> list= new ArrayList<Integer>();


        //цикл для ввода занчений в массив
        for (int i=0;i<5;i++){
            int n = Integer.parseInt(reader.readLine());
           list.add(n);
        }

        //sort arrayList
        for(int i=list.size()-1; i>0; i--){
            for (int j=0;j<i;j++)
            {
                if (list.get(j) > list.get(j + 1))
                {
                    int tmp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,tmp);

                }
            }
        }

        //list out
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }




    }
}
