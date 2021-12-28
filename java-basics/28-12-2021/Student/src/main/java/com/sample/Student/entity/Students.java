package com.sample.Student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String name;
    private String department;
    @Column(nullable = false)
    private float cgpa;
    @Column(nullable = false)
    private Integer age;
    @Column(nullable = false,unique = true,updatable = false)
    private String phoneNumber;

    public Students(){}
    public Students(String name,String department,float cgpa,Integer age,String phoneNumber){
        this.name=name;
        this.department=department;
        this.cgpa=cgpa;
        this.age=age;
        this.phoneNumber=phoneNumber;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public float getCgpa(){
        return cgpa;
    }
    public Integer getAge(){
        return age;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

}
