package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ////////////
   //  System.out.println("VVesti imia faila");
        String filename;
        filename= reader.readLine();
///////////////////////////////////
        InputStream inputStream = new FileInputStream(filename);
        while (inputStream.available()>0){
           int data= inputStream.read();
          System.out.write(data);


        }
        inputStream.close();



    }
}
