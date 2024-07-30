package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class SMSNotifierDecoratorTest {
    @Test
    public void testSMSNotifierDecorator() {
        Notifier notifier = new EmailNotifier();

        Notifier notifieremail = new SMSNotifierDecorator(new EmailNotifier());


        notifieremail.send();
    }

}