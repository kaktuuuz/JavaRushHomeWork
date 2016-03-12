package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int [] arr = new int[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        arr[0]=Integer.parseInt(reader.readLine());
        arr[1]=Integer.parseInt(reader.readLine());
        arr[2]=Integer.parseInt(reader.readLine());
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }


    }
}
