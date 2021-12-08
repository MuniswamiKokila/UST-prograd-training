package com.shape;

public class Perimeter {
    public double perimeterOfRectangle(double length,double breadth){
        double sum=length+breadth;
        if(sum<=0){
            throw new ArithmeticException("Sum of length and breadth should not be equal to zero or negative");
        }
        return 2 * sum;
    }
}
