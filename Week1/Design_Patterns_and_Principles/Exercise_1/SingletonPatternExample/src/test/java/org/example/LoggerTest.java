package org.example;


import org.junit.jupiter.api.Test;

class LoggerTest {
    @Test
        void test() {
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        if (logger == logger1){
            System.out.println("Only single instance is created");
        }
    }


}