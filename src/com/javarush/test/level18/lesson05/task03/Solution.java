package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1;
        String filename2;
        String filename3;

        filename1=reader.readLine();
        filename2=reader.readLine();
        filename3=reader.readLine();
        //filename1="D:\\1.txt";
        //filename2="D:\\2.txt";
        //filename3="D:\\3.txt";

        FileInputStream file1 = new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);
        FileOutputStream file3 = new FileOutputStream(filename3);

        //считать файл используя буффер!
        int size=file1.available()-(file1.available()/2);
        byte[] buff = new byte[size];
        while(file1.available()>0){
            file1.read(buff);
            file2.write(buff);
            int count  = file1.read(buff);
            file3.write(buff,0,count);
        }
        reader.close();
        file1.close();
        file2.close();
        file3.close();
    }
}
