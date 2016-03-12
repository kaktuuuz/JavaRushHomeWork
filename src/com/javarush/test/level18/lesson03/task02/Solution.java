package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename= reader.readLine();

        FileInputStream file = new FileInputStream(filename);
        int min = file.read();
        while(file.available()>0 ){
            int tmp=file.read();
            if(min>tmp){
                min=tmp;
            }

        }
        file.close();
        System.out.print(min);
    }
}
