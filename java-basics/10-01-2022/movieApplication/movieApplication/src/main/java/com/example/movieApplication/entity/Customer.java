package com.example.movieApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String userName;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(unique = true)
    private String mobileNumber;
    @OneToMany(mappedBy = "customer")
    private List<BookedSeats> bookedSeats;

    public Customer() {
    }

    public Customer(String userName, String name, String email, String password,String mobileNumber) {
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.password = password;
        this.mobileNumber=mobileNumber;
    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}
