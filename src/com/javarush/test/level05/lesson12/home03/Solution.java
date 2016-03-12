package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Mouse broMouse = new Mouse ("Bro" , 5 , 7);
        Mouse miniMouse = new Mouse("Mini",2,5);

        Cat tomCat = new Cat("Tom",15, 5 );
        Cat vahaCat = new Cat("Vaha", 56 , 4);
        Cat dadaCat=new Cat("dada", 45, 88);

        Dog spikeDog = new Dog("Spike",7,9);
        Dog dueDog = new Dog("Due",2,5);
        Dog blablaDog = new Dog("baba", 21, 123);

        //Напишите тут ваш код
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog
    {
        String name;
        int height;
        int weight;

        public Dog(String name, int height, int weight)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

    }


    public static class Cat
    {
        String name;
        int height;
        int weight;

        public Cat(String name, int height, int weight)
        {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

    }
}