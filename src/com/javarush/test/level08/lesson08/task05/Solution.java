package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static HashMap<String, String> createMap()

    {
        HashMap<String, String> map = new HashMap<String, String>();



        map.put("FirstName1" ,"Name1");
        map.put("FirstName2" ,"Name2");
        map.put("FirstName3" ,"Name3");
        map.put("FirstName4" ,"Name2");
        map.put("FirstName5" ,"Name5");
        map.put("FirstName6" ,"Name1");
        map.put("FirstName7" ,"Name7");
        map.put("FirstName8" ,"Name8");
        map.put("FirstName9" ,"Name9");
        map.put("FirstName10", "Name10");
        return map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

        LinkedList<String> forDelete = new LinkedList<String>();

    for(Map.Entry<String,String> pair:map.entrySet()){
        String key=pair.getKey();
        String value=pair.getValue();

        for(Map.Entry<String, String> pair2:map.entrySet()){
            String value2=pair2.getValue();
            String key2=pair2.getKey();
            if(value.equals(value2) && !key.equals(key2) ){
                forDelete.add(key);


            }
        }

    }




for(String s:forDelete){
   map.remove(s);
}







    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
