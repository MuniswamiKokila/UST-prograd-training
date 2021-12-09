package com.architect;

public class Architect {

    double value;
    public Architect(double value){
        if(value<=0){
            throw new IllegalArgumentException("Length Cannot be less than or equal to zero");
        }
        this.value=value;
    }
    public double centimeterToCentimeter(){
        return value;
    }

    public double centimeterToKilometer(){
        return value/100000;
    }
    public double meterToCentimeter(){
        return value*100;
    }

//    public double centimeterToMeter() { return value/100;  }

//    public double meterToMeter(){
//        return value;
//    }
//    public double meterToKilometer(){
//        return value/1000;
//    }
//    public double kilometerToCentimeter(){
//        return value*100000;
//    }
//    public double kilometerToMeter(){
//        return value*1000;
//    }
//    public double kilometerToKilometer(){
//        return value;
//    }
}
