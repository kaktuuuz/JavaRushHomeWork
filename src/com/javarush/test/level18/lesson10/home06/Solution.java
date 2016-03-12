package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
      //  String filename= args[0];
String filename;

        filename="C:\\tmp\\file1.txt";

        FileInputStream file = new FileInputStream(filename);

        Map<Byte,Integer> map = new TreeMap<Byte, Integer>();

        while(file.available()>0){
            int tmp = file.read();
            if(map.containsKey(tmp)){
            map.put((byte)tmp,(Integer)map.get(tmp)+1);}
            else{map.put((byte)tmp,1);}
        }

        for( Map.Entry<Byte, Integer> entry : map.entrySet() ){
            System.out.println( entry.getKey() + " " + entry.getValue() );}




    }
}
