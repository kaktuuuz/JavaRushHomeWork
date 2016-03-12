package com.javarush.test.level18.lesson03.task01;

import java.io.*;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        FileInputStream inputStream = new FileInputStream(reader.readLine());

        int m=inputStream.read();

        while (inputStream.available()>0){
            int tmp=inputStream.read();
            if(m<tmp){
                m=tmp;
            }
        }
        System.out.println(m);
        inputStream.close();

    }
}
