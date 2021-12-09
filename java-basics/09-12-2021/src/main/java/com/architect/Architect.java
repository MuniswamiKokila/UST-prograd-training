package com.architect;

public class Architect {

    double value;
    double anothervalue;

    public Architect(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Length Cannot be less than or equal to zero");
        }
        this.value = value;
    }

    public Architect(double value, double anothervalue) {
        if (value <= 0) {
            throw new IllegalArgumentException("Length Cannot be less than or equal to zero");
        }
        this.value = value;
        this.anothervalue = anothervalue;
    }

    public double centimeterToCentimeter() {
        return value;
    }

    public double centimeterToKilometer() {
        return value / 100000;
    }

    public double meterToCentimeter() {
        return value * 100;
    }

    public double additionOfMeterAndCentimetersGivesMeters() {

        return (value + (anothervalue / 100));
    }

    public double additionOfCentimeterAndKilometerGivesCentimeter() {
        return (value + (anothervalue * 100000));
    }


    public double subtractionOfMeterAndCentimeterGivesMeter() {
        return (value - (anothervalue / 100));
    }

    public double subtractionOfCentimeterAndMeterGivesCentimeter() {
        return (value - (anothervalue * 100));
    }
}










//    public double centimeterToMeter() { return value/100;  }
//
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