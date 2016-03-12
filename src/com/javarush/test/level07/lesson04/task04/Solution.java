package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        int[] m = new int[10];
        int[] n = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            m[i]=Integer.parseInt(reader.readLine());
        }

        for(int i=0, j=m.length-1;i<m.length;i++,j--){
            n[i]=m[j];
        }

        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }
}
