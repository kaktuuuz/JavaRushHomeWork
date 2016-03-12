package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String Firstname;
        private String LastName;
        private int age;
        private boolean isMan;
        private ArrayList<String> exp;
        private ArrayList<Human> children;

        public Human (){

        }
        //2
        public Human (String FirstName , String LastName){}
        //3
        public Human (String FirstName, String LastName, int age){

        }
        //4
        public Human (String firstName, String LastName, int age, boolean isMan){}
        //5
        public Human (String firstName, String LastName, int age, boolean isMan,ArrayList<String> exp){}
        //6
        public Human (String firstName, String LastName, int age, boolean isMan,ArrayList<String> exp, ArrayList<Human> children){}
        //7
        public Human ( String LastName, int age, boolean isMan,ArrayList<String> exp, ArrayList<Human> children){}
        //8
        public Human ( int age, boolean isMan,ArrayList<String> exp, ArrayList<Human> children){}
        //9
        public Human ( boolean isMan,ArrayList<String> exp, ArrayList<Human> children){}
        //10
        public Human (ArrayList<String> exp, ArrayList<Human> children){}




    }
}
