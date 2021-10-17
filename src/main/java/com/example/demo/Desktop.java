package com.example.demo;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary  //Implements a high priority to avoid confusion
public class Desktop implements Computer{
    @Override
    public void features() {
        System.out.println("This desktop has 8GB "
                + "RAM 500GB HDD");
    }    
}