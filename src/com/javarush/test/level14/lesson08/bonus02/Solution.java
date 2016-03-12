package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
int a=0;
int b=0;
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(reader.readLine());
        b=Integer.parseInt(reader.readLine());



        System.out.println(getNOD(a,b));

    }
    static ArrayList<Integer> getDelitel(int a){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=a;i>0;i--){
            if(a%i==0){
                list.add(i);
            }
        }
        return   list;
    }

    static void print(List<Integer> list){
        for(int i:list){
            System.out.println(i);
        }

    }
    static int getNOD(int a, int b){
        ArrayList<Integer> aList = getDelitel(a);
        ArrayList<Integer> bList = getDelitel(b);
        int nod=0;
        for(int i=aList.size()-1;i>=0;i--){
            for(int j=bList.size()-1;j>=0;j--){
                if(aList.get(i)==bList.get(j)){
                nod=aList.get(i);
                    break;
                }
            }
        }





        return nod;
    }

}
