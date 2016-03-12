package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }





        String[] array = list.toArray(new String[list.size()]);

        sort(array);
        for (String x : array)
        {
            System.out.println(x);
        }



    //isGreater(2,1) true
}
    public static void sort(String[] array)
    {
        ArrayList<Integer> num = new ArrayList<Integer>();  //array лист где хранятся новера ячеек для цифр и для строк
        ArrayList<Integer> str = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            if(isNumber(array[i])){
                num.add(i);
            }
            else str.add(i);}
        boolean b=true;
       //sort num
        while(b){
            b=false;
            for(int i=0;i<num.size()-1;i++){
              //  System.out.println("i="+i+" num(i)="+num.get(i));
                  //      if(!isGreaterThen(array[num.get(i)],array[num.get(i+1)])){  //по первому символу в строке - не подходит для 2хзначных чисел
                if(Integer.parseInt(array[num.get(i)])<Integer.parseInt(array[num.get(i+1)])){
                           String tmp= array[num.get(i)];
                            array[num.get(i)]=array[num.get(i+1)];
                            array[num.get(i+1)]=tmp;
                            b=true;
                        }  }
            }
        //sort string
        b=true;
        while(b){

            b=false;
            for(int i=0;i<str.size()-1;i++){
                //  System.out.println("i="+i+" num(i)="+num.get(i));
                if(isGreaterThen(array[str.get(i)],array[str.get(i+1)])){  //по первому символу в строке - не подходит для 2хзначных чисел
                    String tmp= array[str.get(i)];
                    array[str.get(i)]=array[str.get(i+1)];
                    array[str.get(i+1)]=tmp;
                    b=true;
                }  }
        }

    }







    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
