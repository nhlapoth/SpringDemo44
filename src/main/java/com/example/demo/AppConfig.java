package com.example.demo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo") //This tells the configuration of where all all components are, which is the package
public class AppConfig {

}