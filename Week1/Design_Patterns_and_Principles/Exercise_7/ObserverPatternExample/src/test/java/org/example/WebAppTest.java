package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class WebAppTest {
    @Test
    public void test() {
        //Updating mobile app
        Observer observer = new MobileApp();
        observer.update();

        //Updating web app

        Observer observer2 = new WebApp();
        observer2.update();
    }

}