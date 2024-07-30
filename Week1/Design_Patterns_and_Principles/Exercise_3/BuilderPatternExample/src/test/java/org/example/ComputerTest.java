package org.example;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class ComputerTest {
    @Test
    public void test() {
        Computer computer = new Computer.ComputerBuilder("CPU_test","RAM_test","Storage_test").build();
        System.out.println("CPU : "+computer.CPU);
        System.out.println("RAM : "+computer.RAM);
        System.out.println("Storage : "+computer.Storage);
    }

}