package org.example;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class PaymentContextTest {
    @Test
    public void test() {
        System.out.println("Testing PaymentContext options");
        PaymentContext pc = new PaymentContext(new CreditCardPayment());
        pc.method();

        PaymentContext pc1 = new PaymentContext(new PayPalPayment());
        pc1.method();
    }

}