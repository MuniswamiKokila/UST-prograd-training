package com.architect;

public class LengthConvertor {

    double magnitude;

    public LengthConvertor(double magnitude) {
        if (magnitude <= 0) {
            throw new IllegalArgumentException("Length Cannot be less than or equal to zero");
        }
        this.magnitude = magnitude;
    }

    public double centimeterToCentimeter() {
        return magnitude;
    }

    public double centimeterToKilometer() {
        return magnitude / 100000;
    }

    public double meterToCentimeter() {
        return magnitude * 100;
    }

    public double centimeterToMeter() { return magnitude/100;  }

    public double kilometerToCentimeter(){ return magnitude*100000; }

}










//    public double centimeterToMeter() { return value/100;  }
//
//    public double meterToMeter(){
//        return value;
//    }
//    public double meterToKilometer(){
//        return value/1000;
//    }
//    public double kilometerToCentimeter(){ return value*100000; }
//    public double kilometerToMeter(){
//        return value*1000;
//    }
//    public double kilometerToKilometer(){
//        return value;
//    }
