package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename= reader.readLine();
        reader.close();


        FileInputStream file= new FileInputStream(filename);
        int count=0;
        while(file.available()>0){
           // ,  = 44 ascii
            if(file.read()==44)count++;


        }
        System.out.print(count);
        file.close();


    }
}
