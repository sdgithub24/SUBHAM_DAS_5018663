package com.library.aspect;

public class LoggingAspect {
    public void method(){
        System.out.println("Method to check log execution time");
    }

    public void logging_before(){
        System.out.println("Logging before method");
    }
    public void logging_after(){
        System.out.println("Logging after method");
    }
}
