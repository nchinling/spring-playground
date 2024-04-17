package com.example.exceptionhandler.model;

public class Profile {
    private String name;
    private String job;
    private String country;
    public Profile() {
    }
    public Profile(String name, String job, String country) {
        this.name = name;
        this.job = job;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Profile [name=" + name + ", job=" + job + ", country=" + country + "]";
    }

    
}
