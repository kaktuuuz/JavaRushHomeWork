package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код

        Human grandpa1 = new Human("Kolya", true ,67,null,null );
        Human grandpa2 = new Human("Denis", true ,87,null,null );

        Human grandma1 = new Human("Nina", false ,65,null,null );
        Human grandma2 = new Human("Valya", false ,85,null,null );

        Human father = new Human("Vadim" , true ,50,grandpa1,grandma1);
        Human mother = new Human("Olga" , false ,40,grandpa2,grandma2);

        Human son1 = new Human("Roma", true, 25 , father,mother);
        Human son2 = new Human("Badik", true, 21 , father,mother);
        Human daughter = new Human("ALALA", false, 18, father,mother);


        System.out.println(grandpa1);
        System.out.println(grandma1);

        System.out.println(grandpa2);
        System.out.println(grandma2);

        System.out.println(mother);
        System.out.println(father);

        System.out.println(son1);
        System.out.println(son2);
        System.out.println(daughter);

    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
        public Human(String name, boolean sex ,int age,Human father,Human mother ){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;

        }
    }

}

