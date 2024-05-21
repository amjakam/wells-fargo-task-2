package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
    private LocalTime startTime;
    private LocalTime endTime;

    protected Advisor() {}

    public Advisor(String firstName, String lastName, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Advisor[id=%d, firstName='%s', lastName='%s', address='%s', phone='%s', email='%s', startTime='%s', endTime='%s']",
                advisorId, firstName, lastName, address, phone, email, startTime, endTime);
    }

    // Getters and setters
    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String    getFirstName() {    
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
