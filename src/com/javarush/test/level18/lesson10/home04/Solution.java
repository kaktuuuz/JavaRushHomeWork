package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename1 = reader.readLine();
        String filename2= reader.readLine();

       // String filename1="C:\\tmp\\file1.txt";
        //String filename2="C:\\tmp\\file2.txt";

        reader.close();

        ArrayList<Integer> ar= new ArrayList();

        FileInputStream input = new FileInputStream(filename1);

        while(input.available()>0){
            ar.add(input.read());
        }
        input = new FileInputStream(filename2);
        FileOutputStream output = new FileOutputStream(filename1);

        while(input.available()>0){
            output.write(input.read());
        }
        for(int a: ar){
            output.write(a);

        }
input.close();
        output.close();



    }
}
