package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        OutputStream outputStream = new FileOutputStream(filename);


        ArrayList<String> arr = new ArrayList<String>();
        String temp=reader.readLine();
        while (!temp.equals("exit")){
            arr.add(temp);
            temp=reader.readLine();
        }
        arr.add("exit");
        for(int i=0;i<arr.size();i++)
        {

            outputStream.write(arr.get(i).getBytes());
            outputStream.write("\r\n".getBytes());
        }

        outputStream.close();
    }
}
