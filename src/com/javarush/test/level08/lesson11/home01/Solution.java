package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();
        cats.remove(iterator.next());


        //напишите тут ваш код. пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        Set<Cat> cats = new HashSet<Cat>();
        cats.add(new Cat("Tima"));
        cats.add(new Cat("Masya"));
        cats.add(new Cat("Vasya"));
        return cats;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        for(Cat c:cats){
            System.out.println(c);
        }
    }

    // пункт 1
    public static class Cat{
        private String name;
        public Cat(String name){
            this.name=name;

        }
/*
        @Override
        public String toString()
        {
            return name;
        }
    */}
}