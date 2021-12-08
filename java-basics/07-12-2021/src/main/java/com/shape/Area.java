package com.shape;

public class Area {
    public double areaOfRectange(double length, double breadth) {
        if(length<0||breadth<0){
            throw new ArithmeticException("length or breadth should not be less than Zero");
        }
        if(length==0||breadth==0){
            throw new ArithmeticException("Length or Breadth should not be zero");
        }
        return length*breadth;
    }
}
