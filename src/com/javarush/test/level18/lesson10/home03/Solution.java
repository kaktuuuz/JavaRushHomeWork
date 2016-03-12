package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename1=reader.readLine();
        String filename2=reader.readLine();
       String filename3=reader.readLine();
        reader.close();

        //String filename1="C:\\tmp\\file1.txt";
        //String filename2="C:\\tmp\\file2.txt";
        //String filename3="C:\\tmp\\file3.txt";

        FileOutputStream file1 = new FileOutputStream(filename1);
        FileInputStream file2 = new FileInputStream(filename2);
        FileInputStream file3 = new FileInputStream(filename3);


        while(file2.available()>0){
            file1.write(file2.read());
        }
        while (file3.available()>0){
            file1.write(file3.read());
        }
        file1.close();
        file2.close();
        file3.close();






    }
}
