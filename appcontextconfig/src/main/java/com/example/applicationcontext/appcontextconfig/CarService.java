package com.example.applicationcontext.appcontextconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarService {
 private final Car car;

    @Autowired
    public CarService(Car car) {
        this.car = car;
    }

    
    public void getCarDetails() {
        car.getBrand();
        car.getColour();
    }
}
