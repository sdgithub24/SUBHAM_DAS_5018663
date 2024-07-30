package org.example;


interface Stock{
    public void register(Observer observer);
    public void deregister(Observer observer);
    public void notify_method();
}

class StockMarket implements Stock{
    @Override
    public void register(Observer observer) {
        //function to register user
        System.out.println("Registering observer");
    }

    @Override
    public void deregister(Observer observer) {
        //function to deregister user
        System.out.println("Deregistering observer");
    }

    @Override
    public void notify_method() {
        //function to notify user
        System.out.println("Notifying observer");

    }

}

interface Observer{
    public void update();
}


class MobileApp implements Observer{
    @Override
    public void update() {
        //function to update
        System.out.println("Mobile App updated");
    }

}

class WebApp implements Observer{
    @Override
    public void update() {
        //function to update webapp
        System.out.println("Web App updated");
    }

}

public class Main {
    public static void main(String[] args) {

        Observer observer = new MobileApp();
        observer.update();

        Observer observer2 = new WebApp();
        observer2.update();

    }
}