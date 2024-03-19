package com.example.applicationcontext.appcontextconfig;

public class Car {
    private String colour;
    private String brand;

    
    // public void setMessage(String message) {
    //     this.message = message;
    // }

    // public void getMessage() {
    //     System.out.println("My Message : " + message);
    // }

    public void getColour() {
        System.out.println("Colour : " + colour);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void getBrand() {
        System.out.println("Brand : " + brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
