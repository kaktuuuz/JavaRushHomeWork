package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1;
        String filename2;

        filename1=reader.readLine();
        filename2=reader.readLine();



        //filename1="D:\\1.txt";
        //filename2="D:\\2.txt";

        FileInputStream file1=new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);


        /*
        List<Integer> list = new  ArrayList<Integer>();
        while(file1.available()>0){
              list.add(file1.read());
        }
        for(int i=list.size()-1;i>=0;i--){
            file2.write(list.get(i));
        }
        */
        byte[] buff = new byte[file1.available()];
        file1.read(buff);
        for(int i=buff.length-1;i>=0;i--){
            file2.write(buff[i]);
        }
        reader.close();
        file1.close();
        file2.close();







    }
}
