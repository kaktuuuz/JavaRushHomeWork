package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename= reader.readLine();
        reader.close();

        FileInputStream file = new FileInputStream(filename);

        Map<Integer,Integer> map = readFile2Map(file);
        viewMin(map);



    }
    public static  Map<Integer,Integer> readFile2Map(FileInputStream file) throws IOException
    {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        while (file.available()>0){

            int tmp=file.read();
            int tmpValue=1;

                    for(Map.Entry<Integer,Integer> pair: map.entrySet()){
                        if(pair.getKey().intValue()==tmp){
                            tmpValue=pair.getValue()+1;
                        }
                          }

            map.put(tmp,tmpValue);
        }

        return map;
    }
    public static void viewMin(Map<Integer,Integer> map){
        //Search min repeats
        int min=999;
        for(Map.Entry<Integer,Integer> pair:map.entrySet()){
            if(min>pair.getValue())min=pair.getValue();
        }
//System.out.println("minimum "+min);
        //view all kyes with min value
        for(Map.Entry<Integer,Integer> pair:map.entrySet()){
            if(pair.getValue().intValue()==min){
                System.out.print(pair.getKey()+" ");
            }
        }

    }

}
