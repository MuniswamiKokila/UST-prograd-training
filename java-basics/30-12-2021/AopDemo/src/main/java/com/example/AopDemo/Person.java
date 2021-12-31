package com.example.AopDemo;

import org.springframework.stereotype.Component;

@Component
public class Person {
    String name;
    int age;
    public void setPersonDetails(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void show() {
        System.out.println("inside show1");
    }
    public void shown() {
        System.out.println("inside shown");
    }
    public void notshow(){
        System.out.println("inside notshow");
    }
}
