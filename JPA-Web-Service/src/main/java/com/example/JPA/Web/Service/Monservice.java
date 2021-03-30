package com.example.JPA.Web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Monservice {
    CarRepository carRepository;

    @Autowired

    public Monservice (CarRepository carRepository){
        System.out.println(carRepository);
        this.carRepository = carRepository;


    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car){
        carRepository.save(car);
    }
}

