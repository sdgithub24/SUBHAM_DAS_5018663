package org.example;

class Logger{
    private static Logger single_instance = null;

    private Logger(){

    }
    public static Logger getInstance(){
        if(single_instance == null)
            single_instance = new Logger();

        return single_instance;


    }
}


public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();

        System.out.println("Hash code of logger : "+logger.hashCode());
        System.out.println("Hash code of logger1 : "+logger1.hashCode());

    }
}