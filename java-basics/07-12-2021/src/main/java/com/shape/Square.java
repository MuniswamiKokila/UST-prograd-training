package com.shape;

public class Square {
    double side;
    Square(double side)
    {
        if(side<=0){
            throw new IllegalArgumentException("Side should not less than or equal to zero");
        }
        this.side=side;
    }
    public double area(){

        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
}
