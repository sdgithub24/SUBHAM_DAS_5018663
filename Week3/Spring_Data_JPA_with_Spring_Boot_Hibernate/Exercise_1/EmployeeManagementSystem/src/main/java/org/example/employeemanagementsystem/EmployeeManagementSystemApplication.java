package org.example.employeemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication {

    public static void main(String[] args) {
        System.out.println("Application.properties file modified.");

        SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }


}
