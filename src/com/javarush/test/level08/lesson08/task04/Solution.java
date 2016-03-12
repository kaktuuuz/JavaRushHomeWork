package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("StalloneJune", new Date("JUNE 1 1980"));
        map.put("September", new Date("SEPTEMBER 5 1989"));
        map.put("July", new Date("JULY 5 1989"));
        map.put("January", new Date("JANUARY 1 1999"));
        map.put("February", new Date("FEBRUARY 1 1999"));
        map.put("March", new Date("MARCH 1 1999"));
        map.put("april", new Date("APRIL 1 1999"));
        map.put("may", new Date("MAY 1 1999"));
        map.put("august", new Date("AUGUST 1 1999"));
        map.put("January1", new Date("JANUARY 1 1999"));

        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

        List<String> foDelete = new LinkedList<String>();
        for(Map.Entry<String, Date> pair:map.entrySet()){
            Date d = pair.getValue();
            if(d.getMonth()==5 ||d.getMonth()==6 || d.getMonth()==7){
          //      map.remove(pair.getKey());
                foDelete.add(pair.getKey());
            }
        }
        for(String s:foDelete){
            map.remove(s);
        }

    }
}
