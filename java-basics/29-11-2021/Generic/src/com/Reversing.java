package com;
class Reversed<E>{
    public void printArray(E[] array){
        Object[] newArray = new Object[array.length];

        for (int i = 0; i <array.length ; i++)

        {
            newArray[i]=array[array.length-i-1];
        }
        for (int i = 0; i <newArray.length ; i++)

        {
            System.out.println(newArray[i]);
        }
    }
}
public class Reversing {
    public static void main(String[] args) {

        Integer[] integerArray = {10,20,30};
        String[] stringArray = {"hi","hello"};
        Reversed<Integer> arr1 = new Reversed<Integer>();
        Reversed<String> arr2 =new Reversed<String>();
        arr1.printArray(integerArray);
        arr2.printArray(stringArray);
    }
}
