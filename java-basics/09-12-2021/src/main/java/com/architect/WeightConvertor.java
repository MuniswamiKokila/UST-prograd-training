package com.architect;

public class WeightConvertor {
    double weight;
    public WeightConvertor(double weight){
        if (weight <= 0) {
            throw new IllegalArgumentException("Length Cannot be less than or equal to zero");
        }
        this.weight = weight;
    }
    public double gramToGram(){
        return weight;
    }
    public double kilogramToGram(){
        return weight*1000;
    }
    public double gramToKilometer(){
        return weight/1000;
    }
}
