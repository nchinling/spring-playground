package com.example.unittest;

import com.example.unittest.Exception.InvalidAgeException;

public class User {
    private int age;
    private String name;
    private String hobby;
    public User() {
    }
    public User(int age, String name, String hobby) {
        this.age = age;
        this.name = name;
        this.hobby = hobby;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
        throw new InvalidAgeException("Age must be a non-negative integer.");
        }
        if (age >= 0 && age <=17) {
            throw new InvalidAgeException("You are not qualified to drive yet.");
        }
    this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHobby() {
        return hobby;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + ", hobby=" + hobby + "]";
    }

    

}
