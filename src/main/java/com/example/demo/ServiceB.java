package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //This is a bean
public class ServiceB implements Service{
    @Autowired  
    @Qualifier("electricPump")      
    private Pump mPump;

    public void doSomething() {
        System.out.println("We have a water"
                + " pump running here");
        mPump.features();
    }    
}