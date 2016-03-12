package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые частые байты
Ввести с консоли имя файла
Найти байт или байты с максимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename= reader.readLine();
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();

        FileInputStream file = new FileInputStream(filename);
        while(file.available()>0){
            addByte2map(file.read(),map);
        }
        viewMaxBytes(map);
        reader.close();
        file.close();



    }
    public static void addByte2map(int i, Map<Integer,Integer> map){
        boolean isThere = false;
        for(Map.Entry<Integer,Integer> pair: map.entrySet() ){
            if(i==pair.getKey().intValue()){
                isThere=true;
            }
        }
        if(isThere){
            map.put(i,(map.get(i)+1));
        }
        else{
            map.put(i,1)
            ;
        }
    }

    public static void viewMap(Map<Integer,Integer>map){
        for(Map.Entry<Integer,Integer> pair:map.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }

    public static int maxRepalys(Map<Integer,Integer> map){
        int maxRepalys=0;
        for(Map.Entry<Integer, Integer> pair:map.entrySet()){
            if(pair.getValue()>maxRepalys){
                maxRepalys=pair.getValue();
            }
        }





        return maxRepalys;
    }

    public static void viewMaxBytes(Map<Integer,Integer> map){
        int maxVal = maxRepalys(map);
        for(Map.Entry<Integer,Integer> pair:map.entrySet()){
            if(pair.getValue()==maxVal){
                System.out.print(pair.getKey()+" ");
            }
        }
    }
}
