package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    private Solution(int i){}
    private Solution(String i){}
    private Solution(short i){}

    protected Solution(Number i){}
    protected Solution(float i){}
    protected Solution(Integer i){}

    public Solution(){}
    public Solution(double i){}
    public Solution(Double i){}

    Solution(Character c){}
    Solution(Byte c){}
    Solution(long c){}
}

