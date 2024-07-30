package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class ProxyImageTest {
    @Test
    public void testProxyImage() {
        Image image = new ProxyImage("Exercise6_test.jpg");

        // Image will be loaded from disk only when display() is called
        image.display();

        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}