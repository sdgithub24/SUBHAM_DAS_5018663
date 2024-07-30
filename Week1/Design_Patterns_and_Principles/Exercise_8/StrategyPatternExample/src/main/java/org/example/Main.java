package org.example;

interface PaymentStrategy{
    public void pay();
}

class CreditCardPayment implements PaymentStrategy{
    public void pay(){
        System.out.println("Payment via credit card");
    }
}

class PayPalPayment implements PaymentStrategy{
    public void pay(){
        System.out.println("Payment via PayPal");

    }
}

class PaymentContext{
    PaymentStrategy p;
    PaymentContext(PaymentStrategy p){
        this.p = p;
    }
    public void method(){
        p.pay();
    }
}
public class Main {
    public static void main(String[] args) {
        PaymentContext pc = new PaymentContext(new CreditCardPayment());
        pc.method();

        PaymentContext pc1 = new PaymentContext(new PayPalPayment());
        pc1.method();




    }
}