package com.bismu.suza.notifiacation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.type.NumericBooleanType;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String fname;
    private String lname;
    private String addres;
    private NumericBooleanType age;
    public Student() {
    }
    public Student(String fname, String lname, String addres, NumericBooleanType age) {
        this.fname = fname;
        this.lname = lname;
        this.addres = addres;
        this.age = age;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAddres() {
        return addres;
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }
    public NumericBooleanType getAge() {
        return age;
    }
    public void setAge(NumericBooleanType age) {
        this.age = age;
    }






}
