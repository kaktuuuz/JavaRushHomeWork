package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
print(5);
print((Integer)54);

    }
static void print(int i){

    System.out.println(i+" int");
}
static void print(Integer s){
    System.out.println(s+" Integer");
}
    //Напишите тут ваши методы
}
