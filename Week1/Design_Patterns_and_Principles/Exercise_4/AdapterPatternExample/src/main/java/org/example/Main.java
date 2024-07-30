package org.example;


    interface PaymentProcessor {
        public void processPayment();
    }

    class Adaptee {
        public void method1() {
            System.out.println("Adaptee1");
        }

        public void method2() {
            System.out.println("Adaptee2");
        }
    }

    class Adapter extends Adaptee implements PaymentProcessor {
        public void processPayment() {
            method1();
            method2();
        }
    }


public class Main {
    public static void main(String[] args) {
        PaymentProcessor m = new Adapter();
        m.processPayment();



    }
}
