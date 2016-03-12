package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        String id="";

        filename = reader.readLine();
        if(args.length!=0){
            id=args[0];
        }

       // id="2";
       // filename = "C:\\tmp\\file1.txt";


        //create FileInpustream
        FileInputStream file = new FileInputStream(filename);

        reader = new BufferedReader(new InputStreamReader(file));
       while(reader.ready()){
           String s=reader.readLine();
          if(s.substring(0,s.indexOf(" ")).trim().equals(id)){
              System.out.println(s);
              break;
          }
       }
        file.close();
        reader.close();

    }
}
