package org.example;

interface Command{
    void execute();
}

class  LightOnCommand implements Command{
    public void execute(){
        System.out.println("Light On");
    }
}

class LightOffCommand implements Command{
    public void execute(){
        System.out.println("Light Off");
    }
}

class RemoteControl {
    Command c;
    RemoteControl(Command c){
        this.c = c;
    }

    public void execute(){
        c.execute();
    }
}

class Light{
    public void LightON(){
        System.out.println("Light On");
    }
    public void LightOFF(){
        System.out.println("Light Off");
    }
}

public class Main {
    public static void main(String[] args) {
        //turning on light using remote control
        RemoteControl r = new RemoteControl(new LightOnCommand());
        r.execute();

        //turning off light using remote control
        RemoteControl r1 = new RemoteControl(new LightOffCommand());
        r1.execute();






    }
}