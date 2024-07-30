package org.example;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CustomerServiceTest {
    @Test
    public void test() {
        System.out.println("Testing");
        CustomerRepository repository = new CustomerRepositoryImpl();
        repository.findCustomerById();
    }

}