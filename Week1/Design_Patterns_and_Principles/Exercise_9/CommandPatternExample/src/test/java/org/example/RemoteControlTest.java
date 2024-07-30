package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class RemoteControlTest {
    @Test
    public void test() {
        System.out.println("Turning lights on using remote control");
        RemoteControl r = new RemoteControl(new LightOnCommand());
        r.execute();

        //turning off light using remote control
        System.out.println("Turning lights off using remote control");
        RemoteControl r1 = new RemoteControl(new LightOffCommand());
        r1.execute();
    }

}