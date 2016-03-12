package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1= reader.readLine();
        String filename2= reader.readLine();
        reader.close();
      //  String filename1="C:\\tmp\\file1.txt";
       // String filename2="C:\\tmp\\file2.txt";

        FileInputStream file1 = new FileInputStream(filename1);
        FileOutputStream file2 = new FileOutputStream(filename2);

//read file to StringBuilder
        StringBuilder sb = new StringBuilder();
        while(file1.available()>0){
            char c = (char)file1.read();
            sb.append(c);
        }
//StringBuleder -> String -> String[]
        String s= sb.toString();
        String[] res = s.split(" ");




        //Double d = -3.14;
        //System.out.println(new BigDecimal(res[0]).setScale(0, RoundingMode.HALF_UP));



//write file2 .   String  -> new BugDecimal -> RounfingMode
       for(String result: res)
       {
           String temp = String.valueOf(new BigDecimal(result).setScale(0, RoundingMode.HALF_UP).intValue());
           file2.write((temp+" ").getBytes());

       }

file1.close();
        file2.close();
    }
}
