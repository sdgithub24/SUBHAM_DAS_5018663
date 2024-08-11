package org.example.employeemanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;




//@SpringBootApplication
@EnableAutoConfiguration
public class EmployeeManagementSystemApplication {
    public static void main(String[] args) {
        System.out.println("Auto configuration enabled and external configuration in com.Employee.External and application.prop modified.");

        //SpringApplication.run(EmployeeManagementSystemApplication.class, args);
    }


}
