package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new  InputStreamReader(System.in));
        String filename;
                filename=reader.readLine();


        //reading all file in arraylist
        reader = new BufferedReader(new FileReader(filename));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(reader.ready()){
            int temp=Integer.parseInt(reader.readLine());
            arr.add(temp);
                    }
        //removing %2==0
        for(int i=0; i<arr.size();i++)
        {
            if(arr.get(i)%2!=0)
            {arr.remove(i);
                i--;}
        }
        Collections.sort(arr);
        //print array
           for(int i:arr){
            System.out.println(i);
        }

    }
}
