package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public void features() {
        System.out.println("This laptop is i3 "
                + "2GB 500GB HDD");
    }   
}