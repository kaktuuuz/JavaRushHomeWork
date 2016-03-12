package com.javarush.test.level18.lesson10.home08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();


    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        String fileName;
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();


        public ReadThread(String fileName) throws IOException
        {
           this.fileName = fileName;
            //implement constructor body
        }

        public void run(){




        }









        // implement file reading here - реализуйте чтение из файла тут
    }
}
