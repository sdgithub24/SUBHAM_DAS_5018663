package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {
    @Test
    public void test() {
        PaymentProcessor m = new Adapter();
        System.out.println("Gateways : ");
        m.processPayment();
    }


}