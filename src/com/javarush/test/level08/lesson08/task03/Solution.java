package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map,"Imya1"));
        System.out.println(getCountTheSameLastName(map,"Familiya1"));
    }
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Familiya1","Imya1");
        map.put("Familiya2","Imya1");
        map.put("Familiya3","Imya1");
        map.put("Familiya4","Imya4");
        map.put("Familiya5","Imya5");
        map.put("Familiya6","Imya6");
        map.put("Familiya7","Imya7");
        map.put("Familiya8","Imya8");
        map.put("Familiya9","Imya9");
        map.put("Familiya10","Imya10");
    return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count =0;

        for(Map.Entry<String, String> pair:map.entrySet() ){
            if(pair.getValue().equals(name)){
                count++;
            }
        }


        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count =0;

        for(Map.Entry<String, String> pair:map.entrySet() ){
            if(pair.getKey().equals(familiya)){
                count++;
            }
        }
        return count;
    }
}
