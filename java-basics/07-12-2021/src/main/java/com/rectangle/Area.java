package com.rectangle;

public class Area {
    public double areaOfRectange(double l, double b) {
      if(l<0||b<0){
                throw new ArithmeticException("length or breadth should not be less than Zero");
        }
      if(l==0||b==0){
          throw new ArithmeticException("Length or Breadth should not be zero");
      }
        return l*b;
    }
}
