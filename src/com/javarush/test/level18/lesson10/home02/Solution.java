package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        String filename = args[0];
        //String filename = "C:\\tmp\\result.txt";
        FileInputStream file = new FileInputStream(filename);


        float countAll=0;
        int countSpace=0;

        while(file.available()>0){
            int data=file.read();
            countAll++;
            if(Integer.valueOf(' ')==data){countSpace++;}
        }

        file.close();

        String result=String.valueOf(countSpace/countAll*100);


        System.out.println(result.substring(0,result.indexOf(".")+3));

    }
}
