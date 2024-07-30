package org.example;

class Computer {
    public String CPU;
    public String RAM;
    public String Storage;

    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public static class ComputerBuilder {

        private String CPU;
        private String RAM;
        private String Storage;


        public ComputerBuilder(String CPU, String RAM, String Storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.Storage = Storage;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("CPU","RAM","Storage").build();
        System.out.println(computer.CPU);
        System.out.println(computer.RAM);
        System.out.println(computer.Storage);


    }
}