package org.example;


import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
public class Car {
    private String color;

    public Car(String color) {
        System.out.print("car object has been created !!!!!!!!!!");
        this.color=color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;

    }
}
