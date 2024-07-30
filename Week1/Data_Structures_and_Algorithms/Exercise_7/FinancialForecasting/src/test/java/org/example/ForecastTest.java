package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class ForecastTest {
    @Test
    public void test() {
        Forecast f = new Forecast();

        System.out.println("Test output = (1+2+...4) :"+f.sum(5));
    }

}