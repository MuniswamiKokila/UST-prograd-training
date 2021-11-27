package com.annotation;

interface Addition {
    public int add(int a,int b);
}
interface Substraction{
    public int sub(int a,int b);
}
interface Multiplication{
    public int mul(int a,int b);
}
interface Division{
    public int div(int a,int b);
}
public class Arithmetic{
    public static void main(String[] args) {
        Addition addition=(a,b) -> {
            System.out.println("a+b");
            return a+b;
        };
        Substraction substraction=(a,b) -> {
            System.out.println("a-b");
            return a-b;
        };
        Multiplication multiplication=(a,b) -> {
            System.out.println("a*b");
            return a*b;
        };
        Division division=(a,b) -> {
            if(b!=0) {
                System.out.println("a/b");
               return a/b;
            }else
                System.out.println("Invalid 2nd Input is ");
                return 0;
        };
        System.out.println(addition.add(10,20));
        System.out.println(substraction.sub(20,30));
        System.out.println(multiplication.mul(10,5));
        System.out.println(division.div(24,8));
    }
}
