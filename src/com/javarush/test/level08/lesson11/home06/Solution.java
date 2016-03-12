package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human child1 = new Human("Child1", true, 26);
        Human child2 = new Human("Child2", true, 22);
        Human child3 = new Human("Child3", false, 18);

        Human mother = new Human("Mother", false,48);
        mother.children.add(child1);
        mother.children.add(child2);
        mother.children.add(child3);

        Human father = new Human ("Father", true, 50);
        father.children.add(child1);
        father.children.add(child2);
        father.children.add(child3);

        Human grandFather1 = new Human("GrandFather1",true,70);
        grandFather1.children.add(father);

        Human grandMother1 = new Human("GrandMother1",false,68);
        grandMother1.children.add(father);

        Human grandFather2 = new Human("GrandFather2",true,74);
        grandFather2.children.add(mother);
        Human grandMother2 = new Human("GrandMother2",false,72);
        grandMother2.children.add(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandMother1);
        System.out.println(grandFather1);
        System.out.println(grandMother2);
        System.out.println(grandFather2);


    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        public ArrayList<Human> children=new ArrayList<Human>();

        public Human(String name, boolean sex, int age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }



        //напишите тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
