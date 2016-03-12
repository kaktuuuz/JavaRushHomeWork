package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man neo = new Man("Neo", 25 , "Heavan");
        Man morph = new Man ("Morphius" , 46 , "Matrix");

        Woman eva = new Woman("Eva" , 45 , "Heavan");
        Woman triniti = new Woman("Trinity", 25, "Matrix City");

        System.out.println(neo.name+" "+neo.age+" "+neo.address);
        System.out.println(morph.name+" "+morph.age+" "+morph.address);

        System.out.println(eva.name+" "+eva.age+" "+eva.address);
        System.out.println(triniti.name+" "+triniti.age+" "+triniti.address);

        // Выведи их на экран тут
    }

    // Напиши тут свои классы
    public static class Man{
        String name, address;
        int age;
        public Man(String name, int age , String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }

    }
    public static class Woman{
        String name,address;
        int age;

        public Woman(String name, int age, String address){
            this.name=name;
            this.age = age;
            this.address= address;
        }

    }
}
