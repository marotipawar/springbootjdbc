package com.maroti.springbootjdbc.entity;

import java.util.Date;
import java.util.Objects;

public class Student {

    private Integer roll;
    private String name;
    private String addr;
    private String mobile;
    private Date dob;
    private String gender;

    public Student() {

    }

    public Student(Integer roll, String name, String addr, String mobile, Date dob, String gender) {
        this.roll = roll;
        this.name = name;
        this.addr = addr;
        this.mobile = mobile;
        this.dob = dob;
        this.gender = gender;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", mobile='" + mobile + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(roll, student.roll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}
